package org.xtext.urdf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'", "'RobotName'", "'Link'", "'Joint'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massValueInKilograms'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'box'", "'Sphere'", "'Limit'", "'lower'", "'upper'", "'effort'", "'velocity'", "'Axis'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'Mimic'", "'multiplier'", "'offSet'", "'mimics'", "'SafetyController'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'k_velocity'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRobot EOF )
            // InternalDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:78:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleMaterial EOF )
            // InternalDsl.g:80:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:87:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Material__Alternatives )
            // InternalDsl.g:94:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:103:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleGeometry EOF )
            // InternalDsl.g:105:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:112:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Geometry__Alternatives )
            // InternalDsl.g:119:4: rule__Geometry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:128:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleLink EOF )
            // InternalDsl.g:130:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:137:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Link__Group__0 )
            // InternalDsl.g:144:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:153:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleJoint EOF )
            // InternalDsl.g:155:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:162:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Joint__Group__0 )
            // InternalDsl.g:169:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:178:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleInertial EOF )
            // InternalDsl.g:180:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:187:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Inertial__Group__0 )
            // InternalDsl.g:194:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:203:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleVisual EOF )
            // InternalDsl.g:205:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:212:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Visual__Group__0 )
            // InternalDsl.g:219:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:228:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleCollision EOF )
            // InternalDsl.g:230:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:237:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Collision__Group__0 )
            // InternalDsl.g:244:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:253:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOrigin EOF )
            // InternalDsl.g:255:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:262:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Origin__Group__0 )
            // InternalDsl.g:269:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:278:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMass EOF )
            // InternalDsl.g:280:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:287:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Mass__Group__0 )
            // InternalDsl.g:294:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:303:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleInertia EOF )
            // InternalDsl.g:305:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:312:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Inertia__Group__0 )
            // InternalDsl.g:319:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleColor EOF )
            // InternalDsl.g:330:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:337:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Color__Group__0 )
            // InternalDsl.g:344:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:353:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTexture EOF )
            // InternalDsl.g:355:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:362:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Texture__Group__0 )
            // InternalDsl.g:369:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:378:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleBox EOF )
            // InternalDsl.g:380:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:387:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Box__Group__0 )
            // InternalDsl.g:394:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:403:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleCylinder EOF )
            // InternalDsl.g:405:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:412:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Cylinder__Group__0 )
            // InternalDsl.g:419:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:428:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleMesh EOF )
            // InternalDsl.g:430:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:437:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Mesh__Group__0 )
            // InternalDsl.g:444:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:453:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleSphere EOF )
            // InternalDsl.g:455:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:462:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Sphere__Group__0 )
            // InternalDsl.g:469:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:478:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleLimit EOF )
            // InternalDsl.g:480:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:487:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Limit__Group__0 )
            // InternalDsl.g:494:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:503:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleAxis EOF )
            // InternalDsl.g:505:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:512:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Axis__Group__0 )
            // InternalDsl.g:519:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:528:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleCalibration EOF )
            // InternalDsl.g:530:1: ruleCalibration EOF
            {
             before(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getCalibrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:537:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__Calibration__Group__0 )
            // InternalDsl.g:544:4: rule__Calibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:553:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleDynamics EOF )
            // InternalDsl.g:555:1: ruleDynamics EOF
            {
             before(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getDynamicsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:562:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Dynamics__Group__0 )
            // InternalDsl.g:569:4: rule__Dynamics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:578:1: entryRuleMimic : ruleMimic EOF ;
    public final void entryRuleMimic() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleMimic EOF )
            // InternalDsl.g:580:1: ruleMimic EOF
            {
             before(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getMimicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:587:1: ruleMimic : ( ( rule__Mimic__Group__0 ) ) ;
    public final void ruleMimic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__Mimic__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__Mimic__Group__0 )
            {
             before(grammarAccess.getMimicAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__Mimic__Group__0 )
            // InternalDsl.g:594:4: rule__Mimic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:603:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSafetyController EOF )
            // InternalDsl.g:605:1: ruleSafetyController EOF
            {
             before(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getSafetyControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:612:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SafetyController__Group__0 )
            // InternalDsl.g:619:4: rule__SafetyController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:628:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleFLOAT EOF )
            // InternalDsl.g:630:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:637:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__FLOAT__Group__0 )
            // InternalDsl.g:644:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:653:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:657:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            // InternalDsl.g:659:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalDsl.g:660:3: ( rule__JointType__Alternatives )
            // InternalDsl.g:660:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalDsl.g:668:1: rule__Material__Alternatives : ( ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( ( ruleColor ) | ( ruleTexture ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==34) ) {
                    alt1=1;
                }
                else if ( (LA1_1==39) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:673:2: ( ruleColor )
                    {
                    // InternalDsl.g:673:2: ( ruleColor )
                    // InternalDsl.g:674:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:679:2: ( ruleTexture )
                    {
                    // InternalDsl.g:679:2: ( ruleTexture )
                    // InternalDsl.g:680:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalDsl.g:689:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:693:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt2=4;
                    }
                    break;
                case 41:
                    {
                    alt2=1;
                    }
                    break;
                case 47:
                    {
                    alt2=3;
                    }
                    break;
                case 45:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:694:2: ( ruleBox )
                    {
                    // InternalDsl.g:694:2: ( ruleBox )
                    // InternalDsl.g:695:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    {
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    // InternalDsl.g:701:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:706:2: ( ruleMesh )
                    {
                    // InternalDsl.g:706:2: ( ruleMesh )
                    // InternalDsl.g:707:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:712:2: ( ruleSphere )
                    {
                    // InternalDsl.g:712:2: ( ruleSphere )
                    // InternalDsl.g:713:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalDsl.g:722:1: rule__JointType__Alternatives : ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:727:2: ( ( 'Revolute' ) )
                    {
                    // InternalDsl.g:727:2: ( ( 'Revolute' ) )
                    // InternalDsl.g:728:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:729:3: ( 'Revolute' )
                    // InternalDsl.g:729:4: 'Revolute'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:733:2: ( ( 'Continous' ) )
                    {
                    // InternalDsl.g:733:2: ( ( 'Continous' ) )
                    // InternalDsl.g:734:3: ( 'Continous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:735:3: ( 'Continous' )
                    // InternalDsl.g:735:4: 'Continous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:739:2: ( ( 'Fixed' ) )
                    {
                    // InternalDsl.g:739:2: ( ( 'Fixed' ) )
                    // InternalDsl.g:740:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:741:3: ( 'Fixed' )
                    // InternalDsl.g:741:4: 'Fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:745:2: ( ( 'Prismatic' ) )
                    {
                    // InternalDsl.g:745:2: ( ( 'Prismatic' ) )
                    // InternalDsl.g:746:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:747:3: ( 'Prismatic' )
                    // InternalDsl.g:747:4: 'Prismatic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalDsl.g:755:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalDsl.g:760:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalDsl.g:767:1: rule__Robot__Group__0__Impl : ( 'RobotName' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:771:1: ( ( 'RobotName' ) )
            // InternalDsl.g:772:1: ( 'RobotName' )
            {
            // InternalDsl.g:772:1: ( 'RobotName' )
            // InternalDsl.g:773:2: 'RobotName'
            {
             before(grammarAccess.getRobotAccess().getRobotNameKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalDsl.g:782:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalDsl.g:787:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalDsl.g:794:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalDsl.g:799:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalDsl.g:799:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalDsl.g:800:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalDsl.g:801:2: ( rule__Robot__NameAssignment_1 )
            // InternalDsl.g:801:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalDsl.g:809:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalDsl.g:814:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalDsl.g:821:1: rule__Robot__Group__2__Impl : ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) )
            // InternalDsl.g:826:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            {
            // InternalDsl.g:826:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            // InternalDsl.g:827:2: ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* )
            {
            // InternalDsl.g:827:2: ( ( rule__Robot__LinkAssignment_2 ) )
            // InternalDsl.g:828:3: ( rule__Robot__LinkAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:829:3: ( rule__Robot__LinkAssignment_2 )
            // InternalDsl.g:829:4: rule__Robot__LinkAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Robot__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }

            // InternalDsl.g:832:2: ( ( rule__Robot__LinkAssignment_2 )* )
            // InternalDsl.g:833:3: ( rule__Robot__LinkAssignment_2 )*
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:834:3: ( rule__Robot__LinkAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:834:4: rule__Robot__LinkAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Robot__LinkAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalDsl.g:843:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__Robot__Group__3__Impl )
            // InternalDsl.g:848:2: rule__Robot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalDsl.g:854:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__JointAssignment_3 )* ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:858:1: ( ( ( rule__Robot__JointAssignment_3 )* ) )
            // InternalDsl.g:859:1: ( ( rule__Robot__JointAssignment_3 )* )
            {
            // InternalDsl.g:859:1: ( ( rule__Robot__JointAssignment_3 )* )
            // InternalDsl.g:860:2: ( rule__Robot__JointAssignment_3 )*
            {
             before(grammarAccess.getRobotAccess().getJointAssignment_3()); 
            // InternalDsl.g:861:2: ( rule__Robot__JointAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:861:3: rule__Robot__JointAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Robot__JointAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getJointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalDsl.g:870:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalDsl.g:875:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalDsl.g:882:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( ( () ) )
            // InternalDsl.g:887:1: ( () )
            {
            // InternalDsl.g:887:1: ( () )
            // InternalDsl.g:888:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalDsl.g:889:2: ()
            // InternalDsl.g:889:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalDsl.g:897:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalDsl.g:902:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalDsl.g:909:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( 'Link' ) )
            // InternalDsl.g:914:1: ( 'Link' )
            {
            // InternalDsl.g:914:1: ( 'Link' )
            // InternalDsl.g:915:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalDsl.g:924:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalDsl.g:929:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalDsl.g:936:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalDsl.g:941:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalDsl.g:941:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalDsl.g:942:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalDsl.g:943:2: ( rule__Link__NameAssignment_2 )
            // InternalDsl.g:943:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalDsl.g:951:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalDsl.g:956:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalDsl.g:963:1: rule__Link__Group__3__Impl : ( ( rule__Link__InertialAssignment_3 )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( ( rule__Link__InertialAssignment_3 )* ) )
            // InternalDsl.g:968:1: ( ( rule__Link__InertialAssignment_3 )* )
            {
            // InternalDsl.g:968:1: ( ( rule__Link__InertialAssignment_3 )* )
            // InternalDsl.g:969:2: ( rule__Link__InertialAssignment_3 )*
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3()); 
            // InternalDsl.g:970:2: ( rule__Link__InertialAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:970:3: rule__Link__InertialAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__InertialAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getInertialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalDsl.g:978:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalDsl.g:983:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalDsl.g:990:1: rule__Link__Group__4__Impl : ( ( rule__Link__VisualsAssignment_4 )* ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( ( ( rule__Link__VisualsAssignment_4 )* ) )
            // InternalDsl.g:995:1: ( ( rule__Link__VisualsAssignment_4 )* )
            {
            // InternalDsl.g:995:1: ( ( rule__Link__VisualsAssignment_4 )* )
            // InternalDsl.g:996:2: ( rule__Link__VisualsAssignment_4 )*
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_4()); 
            // InternalDsl.g:997:2: ( rule__Link__VisualsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==34||LA7_3==39) ) {
                            alt7=1;
                        }


                    }
                    else if ( (LA7_1==18) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:997:3: rule__Link__VisualsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__VisualsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getVisualsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalDsl.g:1005:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__Link__Group__5__Impl )
            // InternalDsl.g:1010:2: rule__Link__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalDsl.g:1016:1: rule__Link__Group__5__Impl : ( ( rule__Link__CollisionAssignment_5 )* ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1020:1: ( ( ( rule__Link__CollisionAssignment_5 )* ) )
            // InternalDsl.g:1021:1: ( ( rule__Link__CollisionAssignment_5 )* )
            {
            // InternalDsl.g:1021:1: ( ( rule__Link__CollisionAssignment_5 )* )
            // InternalDsl.g:1022:2: ( rule__Link__CollisionAssignment_5 )*
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_5()); 
            // InternalDsl.g:1023:2: ( rule__Link__CollisionAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1023:3: rule__Link__CollisionAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__CollisionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getCollisionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalDsl.g:1032:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalDsl.g:1037:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalDsl.g:1044:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( 'Joint' ) )
            // InternalDsl.g:1049:1: ( 'Joint' )
            {
            // InternalDsl.g:1049:1: ( 'Joint' )
            // InternalDsl.g:1050:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalDsl.g:1059:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalDsl.g:1064:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalDsl.g:1071:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalDsl.g:1076:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalDsl.g:1076:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalDsl.g:1077:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalDsl.g:1078:2: ( rule__Joint__NameAssignment_1 )
            // InternalDsl.g:1078:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalDsl.g:1086:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalDsl.g:1091:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalDsl.g:1098:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__TypeAssignment_2 ) ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( ( ( rule__Joint__TypeAssignment_2 ) ) )
            // InternalDsl.g:1103:1: ( ( rule__Joint__TypeAssignment_2 ) )
            {
            // InternalDsl.g:1103:1: ( ( rule__Joint__TypeAssignment_2 ) )
            // InternalDsl.g:1104:2: ( rule__Joint__TypeAssignment_2 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2()); 
            // InternalDsl.g:1105:2: ( rule__Joint__TypeAssignment_2 )
            // InternalDsl.g:1105:3: rule__Joint__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalDsl.g:1113:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalDsl.g:1118:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalDsl.g:1125:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__ChildOfAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( ( rule__Joint__ChildOfAssignment_3 ) ) )
            // InternalDsl.g:1130:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            {
            // InternalDsl.g:1130:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            // InternalDsl.g:1131:2: ( rule__Joint__ChildOfAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_3()); 
            // InternalDsl.g:1132:2: ( rule__Joint__ChildOfAssignment_3 )
            // InternalDsl.g:1132:3: rule__Joint__ChildOfAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalDsl.g:1140:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1144:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalDsl.g:1145:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalDsl.g:1152:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ParentOfAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( ( ( rule__Joint__ParentOfAssignment_4 ) ) )
            // InternalDsl.g:1157:1: ( ( rule__Joint__ParentOfAssignment_4 ) )
            {
            // InternalDsl.g:1157:1: ( ( rule__Joint__ParentOfAssignment_4 ) )
            // InternalDsl.g:1158:2: ( rule__Joint__ParentOfAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_4()); 
            // InternalDsl.g:1159:2: ( rule__Joint__ParentOfAssignment_4 )
            // InternalDsl.g:1159:3: rule__Joint__ParentOfAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalDsl.g:1167:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalDsl.g:1172:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalDsl.g:1179:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__LimitAssignment_5 )? ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( ( rule__Joint__LimitAssignment_5 )? ) )
            // InternalDsl.g:1184:1: ( ( rule__Joint__LimitAssignment_5 )? )
            {
            // InternalDsl.g:1184:1: ( ( rule__Joint__LimitAssignment_5 )? )
            // InternalDsl.g:1185:2: ( rule__Joint__LimitAssignment_5 )?
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_5()); 
            // InternalDsl.g:1186:2: ( rule__Joint__LimitAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==50) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1186:3: rule__Joint__LimitAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__LimitAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getLimitAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalDsl.g:1194:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalDsl.g:1199:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalDsl.g:1206:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__AxisAssignment_6 )? ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( ( rule__Joint__AxisAssignment_6 )? ) )
            // InternalDsl.g:1211:1: ( ( rule__Joint__AxisAssignment_6 )? )
            {
            // InternalDsl.g:1211:1: ( ( rule__Joint__AxisAssignment_6 )? )
            // InternalDsl.g:1212:2: ( rule__Joint__AxisAssignment_6 )?
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_6()); 
            // InternalDsl.g:1213:2: ( rule__Joint__AxisAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1213:3: rule__Joint__AxisAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__AxisAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getAxisAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalDsl.g:1221:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalDsl.g:1226:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalDsl.g:1233:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__OriginAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( ( ( rule__Joint__OriginAssignment_7 ) ) )
            // InternalDsl.g:1238:1: ( ( rule__Joint__OriginAssignment_7 ) )
            {
            // InternalDsl.g:1238:1: ( ( rule__Joint__OriginAssignment_7 ) )
            // InternalDsl.g:1239:2: ( rule__Joint__OriginAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_7()); 
            // InternalDsl.g:1240:2: ( rule__Joint__OriginAssignment_7 )
            // InternalDsl.g:1240:3: rule__Joint__OriginAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalDsl.g:1248:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalDsl.g:1253:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalDsl.g:1260:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__CalibrationAssignment_8 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( ( ( rule__Joint__CalibrationAssignment_8 )? ) )
            // InternalDsl.g:1265:1: ( ( rule__Joint__CalibrationAssignment_8 )? )
            {
            // InternalDsl.g:1265:1: ( ( rule__Joint__CalibrationAssignment_8 )? )
            // InternalDsl.g:1266:2: ( rule__Joint__CalibrationAssignment_8 )?
            {
             before(grammarAccess.getJointAccess().getCalibrationAssignment_8()); 
            // InternalDsl.g:1267:2: ( rule__Joint__CalibrationAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==56) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1267:3: rule__Joint__CalibrationAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__CalibrationAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getCalibrationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalDsl.g:1275:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalDsl.g:1280:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalDsl.g:1287:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__DynamicsAssignment_9 )? ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( ( ( rule__Joint__DynamicsAssignment_9 )? ) )
            // InternalDsl.g:1292:1: ( ( rule__Joint__DynamicsAssignment_9 )? )
            {
            // InternalDsl.g:1292:1: ( ( rule__Joint__DynamicsAssignment_9 )? )
            // InternalDsl.g:1293:2: ( rule__Joint__DynamicsAssignment_9 )?
            {
             before(grammarAccess.getJointAccess().getDynamicsAssignment_9()); 
            // InternalDsl.g:1294:2: ( rule__Joint__DynamicsAssignment_9 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==59) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1294:3: rule__Joint__DynamicsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__DynamicsAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getDynamicsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalDsl.g:1302:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalDsl.g:1307:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalDsl.g:1314:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__MimicAssignment_10 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( ( ( rule__Joint__MimicAssignment_10 )? ) )
            // InternalDsl.g:1319:1: ( ( rule__Joint__MimicAssignment_10 )? )
            {
            // InternalDsl.g:1319:1: ( ( rule__Joint__MimicAssignment_10 )? )
            // InternalDsl.g:1320:2: ( rule__Joint__MimicAssignment_10 )?
            {
             before(grammarAccess.getJointAccess().getMimicAssignment_10()); 
            // InternalDsl.g:1321:2: ( rule__Joint__MimicAssignment_10 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==62) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1321:3: rule__Joint__MimicAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__MimicAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getMimicAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // InternalDsl.g:1329:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__Joint__Group__11__Impl )
            // InternalDsl.g:1334:2: rule__Joint__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalDsl.g:1340:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__SafetycontrollerAssignment_11 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1344:1: ( ( ( rule__Joint__SafetycontrollerAssignment_11 )? ) )
            // InternalDsl.g:1345:1: ( ( rule__Joint__SafetycontrollerAssignment_11 )? )
            {
            // InternalDsl.g:1345:1: ( ( rule__Joint__SafetycontrollerAssignment_11 )? )
            // InternalDsl.g:1346:2: ( rule__Joint__SafetycontrollerAssignment_11 )?
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_11()); 
            // InternalDsl.g:1347:2: ( rule__Joint__SafetycontrollerAssignment_11 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1347:3: rule__Joint__SafetycontrollerAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__SafetycontrollerAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalDsl.g:1356:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalDsl.g:1361:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalDsl.g:1368:1: rule__Inertial__Group__0__Impl : ( ( rule__Inertial__NameAssignment_0 ) ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( ( ( rule__Inertial__NameAssignment_0 ) ) )
            // InternalDsl.g:1373:1: ( ( rule__Inertial__NameAssignment_0 ) )
            {
            // InternalDsl.g:1373:1: ( ( rule__Inertial__NameAssignment_0 ) )
            // InternalDsl.g:1374:2: ( rule__Inertial__NameAssignment_0 )
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_0()); 
            // InternalDsl.g:1375:2: ( rule__Inertial__NameAssignment_0 )
            // InternalDsl.g:1375:3: rule__Inertial__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalDsl.g:1383:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalDsl.g:1388:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalDsl.g:1395:1: rule__Inertial__Group__1__Impl : ( ( rule__Inertial__OriginAssignment_1 ) ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( ( rule__Inertial__OriginAssignment_1 ) ) )
            // InternalDsl.g:1400:1: ( ( rule__Inertial__OriginAssignment_1 ) )
            {
            // InternalDsl.g:1400:1: ( ( rule__Inertial__OriginAssignment_1 ) )
            // InternalDsl.g:1401:2: ( rule__Inertial__OriginAssignment_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_1()); 
            // InternalDsl.g:1402:2: ( rule__Inertial__OriginAssignment_1 )
            // InternalDsl.g:1402:3: rule__Inertial__OriginAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__OriginAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalDsl.g:1410:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalDsl.g:1415:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Inertial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalDsl.g:1422:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__MassAssignment_2 ) ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( ( ( rule__Inertial__MassAssignment_2 ) ) )
            // InternalDsl.g:1427:1: ( ( rule__Inertial__MassAssignment_2 ) )
            {
            // InternalDsl.g:1427:1: ( ( rule__Inertial__MassAssignment_2 ) )
            // InternalDsl.g:1428:2: ( rule__Inertial__MassAssignment_2 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_2()); 
            // InternalDsl.g:1429:2: ( rule__Inertial__MassAssignment_2 )
            // InternalDsl.g:1429:3: rule__Inertial__MassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Inertial__Group__3"
    // InternalDsl.g:1437:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__Inertial__Group__3__Impl )
            // InternalDsl.g:1442:2: rule__Inertial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3"


    // $ANTLR start "rule__Inertial__Group__3__Impl"
    // InternalDsl.g:1448:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1452:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalDsl.g:1453:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalDsl.g:1453:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalDsl.g:1454:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalDsl.g:1455:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalDsl.g:1455:3: rule__Inertial__InertiaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalDsl.g:1464:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalDsl.g:1469:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalDsl.g:1476:1: rule__Visual__Group__0__Impl : ( ( rule__Visual__NameAssignment_0 ) ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( ( ( rule__Visual__NameAssignment_0 ) ) )
            // InternalDsl.g:1481:1: ( ( rule__Visual__NameAssignment_0 ) )
            {
            // InternalDsl.g:1481:1: ( ( rule__Visual__NameAssignment_0 ) )
            // InternalDsl.g:1482:2: ( rule__Visual__NameAssignment_0 )
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_0()); 
            // InternalDsl.g:1483:2: ( rule__Visual__NameAssignment_0 )
            // InternalDsl.g:1483:3: rule__Visual__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalDsl.g:1491:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalDsl.g:1496:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalDsl.g:1503:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__MaterialAssignment_1 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( ( rule__Visual__MaterialAssignment_1 )? ) )
            // InternalDsl.g:1508:1: ( ( rule__Visual__MaterialAssignment_1 )? )
            {
            // InternalDsl.g:1508:1: ( ( rule__Visual__MaterialAssignment_1 )? )
            // InternalDsl.g:1509:2: ( rule__Visual__MaterialAssignment_1 )?
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_1()); 
            // InternalDsl.g:1510:2: ( rule__Visual__MaterialAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1510:3: rule__Visual__MaterialAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__MaterialAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalDsl.g:1518:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalDsl.g:1523:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalDsl.g:1530:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__OriginAssignment_2 ) ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( ( ( rule__Visual__OriginAssignment_2 ) ) )
            // InternalDsl.g:1535:1: ( ( rule__Visual__OriginAssignment_2 ) )
            {
            // InternalDsl.g:1535:1: ( ( rule__Visual__OriginAssignment_2 ) )
            // InternalDsl.g:1536:2: ( rule__Visual__OriginAssignment_2 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_2()); 
            // InternalDsl.g:1537:2: ( rule__Visual__OriginAssignment_2 )
            // InternalDsl.g:1537:3: rule__Visual__OriginAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Visual__OriginAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalDsl.g:1545:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__Visual__Group__3__Impl )
            // InternalDsl.g:1550:2: rule__Visual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalDsl.g:1556:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1560:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalDsl.g:1561:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalDsl.g:1561:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalDsl.g:1562:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalDsl.g:1563:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalDsl.g:1563:3: rule__Visual__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalDsl.g:1572:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalDsl.g:1577:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalDsl.g:1584:1: rule__Collision__Group__0__Impl : ( ( rule__Collision__NameAssignment_0 ) ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( ( ( rule__Collision__NameAssignment_0 ) ) )
            // InternalDsl.g:1589:1: ( ( rule__Collision__NameAssignment_0 ) )
            {
            // InternalDsl.g:1589:1: ( ( rule__Collision__NameAssignment_0 ) )
            // InternalDsl.g:1590:2: ( rule__Collision__NameAssignment_0 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_0()); 
            // InternalDsl.g:1591:2: ( rule__Collision__NameAssignment_0 )
            // InternalDsl.g:1591:3: rule__Collision__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalDsl.g:1599:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1603:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalDsl.g:1604:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalDsl.g:1611:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__GeometryAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( ( ( rule__Collision__GeometryAssignment_1 ) ) )
            // InternalDsl.g:1616:1: ( ( rule__Collision__GeometryAssignment_1 ) )
            {
            // InternalDsl.g:1616:1: ( ( rule__Collision__GeometryAssignment_1 ) )
            // InternalDsl.g:1617:2: ( rule__Collision__GeometryAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_1()); 
            // InternalDsl.g:1618:2: ( rule__Collision__GeometryAssignment_1 )
            // InternalDsl.g:1618:3: rule__Collision__GeometryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalDsl.g:1626:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1630:1: ( rule__Collision__Group__2__Impl )
            // InternalDsl.g:1631:2: rule__Collision__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalDsl.g:1637:1: rule__Collision__Group__2__Impl : ( ( rule__Collision__OriginAssignment_2 ) ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1641:1: ( ( ( rule__Collision__OriginAssignment_2 ) ) )
            // InternalDsl.g:1642:1: ( ( rule__Collision__OriginAssignment_2 ) )
            {
            // InternalDsl.g:1642:1: ( ( rule__Collision__OriginAssignment_2 ) )
            // InternalDsl.g:1643:2: ( rule__Collision__OriginAssignment_2 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_2()); 
            // InternalDsl.g:1644:2: ( rule__Collision__OriginAssignment_2 )
            // InternalDsl.g:1644:3: rule__Collision__OriginAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalDsl.g:1653:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalDsl.g:1658:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalDsl.g:1665:1: rule__Origin__Group__0__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( ( 'Origin' ) )
            // InternalDsl.g:1670:1: ( 'Origin' )
            {
            // InternalDsl.g:1670:1: ( 'Origin' )
            // InternalDsl.g:1671:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalDsl.g:1680:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1684:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalDsl.g:1685:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalDsl.g:1692:1: rule__Origin__Group__1__Impl : ( ( rule__Origin__NameAssignment_1 ) ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1696:1: ( ( ( rule__Origin__NameAssignment_1 ) ) )
            // InternalDsl.g:1697:1: ( ( rule__Origin__NameAssignment_1 ) )
            {
            // InternalDsl.g:1697:1: ( ( rule__Origin__NameAssignment_1 ) )
            // InternalDsl.g:1698:2: ( rule__Origin__NameAssignment_1 )
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_1()); 
            // InternalDsl.g:1699:2: ( rule__Origin__NameAssignment_1 )
            // InternalDsl.g:1699:3: rule__Origin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalDsl.g:1707:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalDsl.g:1712:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalDsl.g:1719:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__Group_2__0 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( ( ( rule__Origin__Group_2__0 )? ) )
            // InternalDsl.g:1724:1: ( ( rule__Origin__Group_2__0 )? )
            {
            // InternalDsl.g:1724:1: ( ( rule__Origin__Group_2__0 )? )
            // InternalDsl.g:1725:2: ( rule__Origin__Group_2__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_2()); 
            // InternalDsl.g:1726:2: ( rule__Origin__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1726:3: rule__Origin__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalDsl.g:1734:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1738:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalDsl.g:1739:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalDsl.g:1746:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__Group_3__0 )? ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( ( ( rule__Origin__Group_3__0 )? ) )
            // InternalDsl.g:1751:1: ( ( rule__Origin__Group_3__0 )? )
            {
            // InternalDsl.g:1751:1: ( ( rule__Origin__Group_3__0 )? )
            // InternalDsl.g:1752:2: ( rule__Origin__Group_3__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_3()); 
            // InternalDsl.g:1753:2: ( rule__Origin__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1753:3: rule__Origin__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalDsl.g:1761:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1765:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalDsl.g:1766:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalDsl.g:1773:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__Group_4__0 )? ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1777:1: ( ( ( rule__Origin__Group_4__0 )? ) )
            // InternalDsl.g:1778:1: ( ( rule__Origin__Group_4__0 )? )
            {
            // InternalDsl.g:1778:1: ( ( rule__Origin__Group_4__0 )? )
            // InternalDsl.g:1779:2: ( rule__Origin__Group_4__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_4()); 
            // InternalDsl.g:1780:2: ( rule__Origin__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1780:3: rule__Origin__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalDsl.g:1788:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalDsl.g:1793:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalDsl.g:1800:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__Group_5__0 )? ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( ( ( rule__Origin__Group_5__0 )? ) )
            // InternalDsl.g:1805:1: ( ( rule__Origin__Group_5__0 )? )
            {
            // InternalDsl.g:1805:1: ( ( rule__Origin__Group_5__0 )? )
            // InternalDsl.g:1806:2: ( rule__Origin__Group_5__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_5()); 
            // InternalDsl.g:1807:2: ( rule__Origin__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1807:3: rule__Origin__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalDsl.g:1815:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1819:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalDsl.g:1820:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalDsl.g:1827:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__Group_6__0 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1831:1: ( ( ( rule__Origin__Group_6__0 )? ) )
            // InternalDsl.g:1832:1: ( ( rule__Origin__Group_6__0 )? )
            {
            // InternalDsl.g:1832:1: ( ( rule__Origin__Group_6__0 )? )
            // InternalDsl.g:1833:2: ( rule__Origin__Group_6__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_6()); 
            // InternalDsl.g:1834:2: ( rule__Origin__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1834:3: rule__Origin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group__7"
    // InternalDsl.g:1842:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( rule__Origin__Group__7__Impl )
            // InternalDsl.g:1847:2: rule__Origin__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__7"


    // $ANTLR start "rule__Origin__Group__7__Impl"
    // InternalDsl.g:1853:1: rule__Origin__Group__7__Impl : ( ( rule__Origin__Group_7__0 )? ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1857:1: ( ( ( rule__Origin__Group_7__0 )? ) )
            // InternalDsl.g:1858:1: ( ( rule__Origin__Group_7__0 )? )
            {
            // InternalDsl.g:1858:1: ( ( rule__Origin__Group_7__0 )? )
            // InternalDsl.g:1859:2: ( rule__Origin__Group_7__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_7()); 
            // InternalDsl.g:1860:2: ( rule__Origin__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1860:3: rule__Origin__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__7__Impl"


    // $ANTLR start "rule__Origin__Group_2__0"
    // InternalDsl.g:1869:1: rule__Origin__Group_2__0 : rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1 ;
    public final void rule__Origin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1 )
            // InternalDsl.g:1874:2: rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_2__0"


    // $ANTLR start "rule__Origin__Group_2__0__Impl"
    // InternalDsl.g:1881:1: rule__Origin__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__Origin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( ( 'x' ) )
            // InternalDsl.g:1886:1: ( 'x' )
            {
            // InternalDsl.g:1886:1: ( 'x' )
            // InternalDsl.g:1887:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_2__0__Impl"


    // $ANTLR start "rule__Origin__Group_2__1"
    // InternalDsl.g:1896:1: rule__Origin__Group_2__1 : rule__Origin__Group_2__1__Impl ;
    public final void rule__Origin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( rule__Origin__Group_2__1__Impl )
            // InternalDsl.g:1901:2: rule__Origin__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_2__1"


    // $ANTLR start "rule__Origin__Group_2__1__Impl"
    // InternalDsl.g:1907:1: rule__Origin__Group_2__1__Impl : ( ( rule__Origin__XAssignment_2_1 ) ) ;
    public final void rule__Origin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1911:1: ( ( ( rule__Origin__XAssignment_2_1 ) ) )
            // InternalDsl.g:1912:1: ( ( rule__Origin__XAssignment_2_1 ) )
            {
            // InternalDsl.g:1912:1: ( ( rule__Origin__XAssignment_2_1 ) )
            // InternalDsl.g:1913:2: ( rule__Origin__XAssignment_2_1 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_2_1()); 
            // InternalDsl.g:1914:2: ( rule__Origin__XAssignment_2_1 )
            // InternalDsl.g:1914:3: rule__Origin__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_2__1__Impl"


    // $ANTLR start "rule__Origin__Group_3__0"
    // InternalDsl.g:1923:1: rule__Origin__Group_3__0 : rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1 ;
    public final void rule__Origin__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1 )
            // InternalDsl.g:1928:2: rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_3__0"


    // $ANTLR start "rule__Origin__Group_3__0__Impl"
    // InternalDsl.g:1935:1: rule__Origin__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__Origin__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( ( 'y' ) )
            // InternalDsl.g:1940:1: ( 'y' )
            {
            // InternalDsl.g:1940:1: ( 'y' )
            // InternalDsl.g:1941:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_3__0__Impl"


    // $ANTLR start "rule__Origin__Group_3__1"
    // InternalDsl.g:1950:1: rule__Origin__Group_3__1 : rule__Origin__Group_3__1__Impl ;
    public final void rule__Origin__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( rule__Origin__Group_3__1__Impl )
            // InternalDsl.g:1955:2: rule__Origin__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_3__1"


    // $ANTLR start "rule__Origin__Group_3__1__Impl"
    // InternalDsl.g:1961:1: rule__Origin__Group_3__1__Impl : ( ( rule__Origin__YAssignment_3_1 ) ) ;
    public final void rule__Origin__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1965:1: ( ( ( rule__Origin__YAssignment_3_1 ) ) )
            // InternalDsl.g:1966:1: ( ( rule__Origin__YAssignment_3_1 ) )
            {
            // InternalDsl.g:1966:1: ( ( rule__Origin__YAssignment_3_1 ) )
            // InternalDsl.g:1967:2: ( rule__Origin__YAssignment_3_1 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_3_1()); 
            // InternalDsl.g:1968:2: ( rule__Origin__YAssignment_3_1 )
            // InternalDsl.g:1968:3: rule__Origin__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_3__1__Impl"


    // $ANTLR start "rule__Origin__Group_4__0"
    // InternalDsl.g:1977:1: rule__Origin__Group_4__0 : rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1 ;
    public final void rule__Origin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1 )
            // InternalDsl.g:1982:2: rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_4__0"


    // $ANTLR start "rule__Origin__Group_4__0__Impl"
    // InternalDsl.g:1989:1: rule__Origin__Group_4__0__Impl : ( 'z' ) ;
    public final void rule__Origin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( ( 'z' ) )
            // InternalDsl.g:1994:1: ( 'z' )
            {
            // InternalDsl.g:1994:1: ( 'z' )
            // InternalDsl.g:1995:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getZKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_4__0__Impl"


    // $ANTLR start "rule__Origin__Group_4__1"
    // InternalDsl.g:2004:1: rule__Origin__Group_4__1 : rule__Origin__Group_4__1__Impl ;
    public final void rule__Origin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( rule__Origin__Group_4__1__Impl )
            // InternalDsl.g:2009:2: rule__Origin__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_4__1"


    // $ANTLR start "rule__Origin__Group_4__1__Impl"
    // InternalDsl.g:2015:1: rule__Origin__Group_4__1__Impl : ( ( rule__Origin__ZAssignment_4_1 ) ) ;
    public final void rule__Origin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2019:1: ( ( ( rule__Origin__ZAssignment_4_1 ) ) )
            // InternalDsl.g:2020:1: ( ( rule__Origin__ZAssignment_4_1 ) )
            {
            // InternalDsl.g:2020:1: ( ( rule__Origin__ZAssignment_4_1 ) )
            // InternalDsl.g:2021:2: ( rule__Origin__ZAssignment_4_1 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_4_1()); 
            // InternalDsl.g:2022:2: ( rule__Origin__ZAssignment_4_1 )
            // InternalDsl.g:2022:3: rule__Origin__ZAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_4__1__Impl"


    // $ANTLR start "rule__Origin__Group_5__0"
    // InternalDsl.g:2031:1: rule__Origin__Group_5__0 : rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1 ;
    public final void rule__Origin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2035:1: ( rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1 )
            // InternalDsl.g:2036:2: rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_5__0"


    // $ANTLR start "rule__Origin__Group_5__0__Impl"
    // InternalDsl.g:2043:1: rule__Origin__Group_5__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( ( 'roll' ) )
            // InternalDsl.g:2048:1: ( 'roll' )
            {
            // InternalDsl.g:2048:1: ( 'roll' )
            // InternalDsl.g:2049:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRollKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_5__0__Impl"


    // $ANTLR start "rule__Origin__Group_5__1"
    // InternalDsl.g:2058:1: rule__Origin__Group_5__1 : rule__Origin__Group_5__1__Impl ;
    public final void rule__Origin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( rule__Origin__Group_5__1__Impl )
            // InternalDsl.g:2063:2: rule__Origin__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_5__1"


    // $ANTLR start "rule__Origin__Group_5__1__Impl"
    // InternalDsl.g:2069:1: rule__Origin__Group_5__1__Impl : ( ( rule__Origin__RollAssignment_5_1 ) ) ;
    public final void rule__Origin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2073:1: ( ( ( rule__Origin__RollAssignment_5_1 ) ) )
            // InternalDsl.g:2074:1: ( ( rule__Origin__RollAssignment_5_1 ) )
            {
            // InternalDsl.g:2074:1: ( ( rule__Origin__RollAssignment_5_1 ) )
            // InternalDsl.g:2075:2: ( rule__Origin__RollAssignment_5_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_5_1()); 
            // InternalDsl.g:2076:2: ( rule__Origin__RollAssignment_5_1 )
            // InternalDsl.g:2076:3: rule__Origin__RollAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_5__1__Impl"


    // $ANTLR start "rule__Origin__Group_6__0"
    // InternalDsl.g:2085:1: rule__Origin__Group_6__0 : rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 ;
    public final void rule__Origin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2089:1: ( rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 )
            // InternalDsl.g:2090:2: rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0"


    // $ANTLR start "rule__Origin__Group_6__0__Impl"
    // InternalDsl.g:2097:1: rule__Origin__Group_6__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( ( 'pitch' ) )
            // InternalDsl.g:2102:1: ( 'pitch' )
            {
            // InternalDsl.g:2102:1: ( 'pitch' )
            // InternalDsl.g:2103:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getPitchKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0__Impl"


    // $ANTLR start "rule__Origin__Group_6__1"
    // InternalDsl.g:2112:1: rule__Origin__Group_6__1 : rule__Origin__Group_6__1__Impl ;
    public final void rule__Origin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2116:1: ( rule__Origin__Group_6__1__Impl )
            // InternalDsl.g:2117:2: rule__Origin__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1"


    // $ANTLR start "rule__Origin__Group_6__1__Impl"
    // InternalDsl.g:2123:1: rule__Origin__Group_6__1__Impl : ( ( rule__Origin__PitchAssignment_6_1 ) ) ;
    public final void rule__Origin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2127:1: ( ( ( rule__Origin__PitchAssignment_6_1 ) ) )
            // InternalDsl.g:2128:1: ( ( rule__Origin__PitchAssignment_6_1 ) )
            {
            // InternalDsl.g:2128:1: ( ( rule__Origin__PitchAssignment_6_1 ) )
            // InternalDsl.g:2129:2: ( rule__Origin__PitchAssignment_6_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_6_1()); 
            // InternalDsl.g:2130:2: ( rule__Origin__PitchAssignment_6_1 )
            // InternalDsl.g:2130:3: rule__Origin__PitchAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1__Impl"


    // $ANTLR start "rule__Origin__Group_7__0"
    // InternalDsl.g:2139:1: rule__Origin__Group_7__0 : rule__Origin__Group_7__0__Impl rule__Origin__Group_7__1 ;
    public final void rule__Origin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2143:1: ( rule__Origin__Group_7__0__Impl rule__Origin__Group_7__1 )
            // InternalDsl.g:2144:2: rule__Origin__Group_7__0__Impl rule__Origin__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_7__0"


    // $ANTLR start "rule__Origin__Group_7__0__Impl"
    // InternalDsl.g:2151:1: rule__Origin__Group_7__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( ( 'yaw' ) )
            // InternalDsl.g:2156:1: ( 'yaw' )
            {
            // InternalDsl.g:2156:1: ( 'yaw' )
            // InternalDsl.g:2157:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYawKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_7__0__Impl"


    // $ANTLR start "rule__Origin__Group_7__1"
    // InternalDsl.g:2166:1: rule__Origin__Group_7__1 : rule__Origin__Group_7__1__Impl ;
    public final void rule__Origin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2170:1: ( rule__Origin__Group_7__1__Impl )
            // InternalDsl.g:2171:2: rule__Origin__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_7__1"


    // $ANTLR start "rule__Origin__Group_7__1__Impl"
    // InternalDsl.g:2177:1: rule__Origin__Group_7__1__Impl : ( ( rule__Origin__YawAssignment_7_1 ) ) ;
    public final void rule__Origin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2181:1: ( ( ( rule__Origin__YawAssignment_7_1 ) ) )
            // InternalDsl.g:2182:1: ( ( rule__Origin__YawAssignment_7_1 ) )
            {
            // InternalDsl.g:2182:1: ( ( rule__Origin__YawAssignment_7_1 ) )
            // InternalDsl.g:2183:2: ( rule__Origin__YawAssignment_7_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_7_1()); 
            // InternalDsl.g:2184:2: ( rule__Origin__YawAssignment_7_1 )
            // InternalDsl.g:2184:3: rule__Origin__YawAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_7__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalDsl.g:2193:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2197:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalDsl.g:2198:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalDsl.g:2205:1: rule__Mass__Group__0__Impl : ( ( rule__Mass__NameAssignment_0 ) ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2209:1: ( ( ( rule__Mass__NameAssignment_0 ) ) )
            // InternalDsl.g:2210:1: ( ( rule__Mass__NameAssignment_0 ) )
            {
            // InternalDsl.g:2210:1: ( ( rule__Mass__NameAssignment_0 ) )
            // InternalDsl.g:2211:2: ( rule__Mass__NameAssignment_0 )
            {
             before(grammarAccess.getMassAccess().getNameAssignment_0()); 
            // InternalDsl.g:2212:2: ( rule__Mass__NameAssignment_0 )
            // InternalDsl.g:2212:3: rule__Mass__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalDsl.g:2220:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2224:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalDsl.g:2225:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalDsl.g:2232:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( ( 'Mass' ) )
            // InternalDsl.g:2237:1: ( 'Mass' )
            {
            // InternalDsl.g:2237:1: ( 'Mass' )
            // InternalDsl.g:2238:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalDsl.g:2247:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2251:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalDsl.g:2252:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalDsl.g:2259:1: rule__Mass__Group__2__Impl : ( 'massValueInKilograms' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( ( 'massValueInKilograms' ) )
            // InternalDsl.g:2264:1: ( 'massValueInKilograms' )
            {
            // InternalDsl.g:2264:1: ( 'massValueInKilograms' )
            // InternalDsl.g:2265:2: 'massValueInKilograms'
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalDsl.g:2274:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2278:1: ( rule__Mass__Group__3__Impl )
            // InternalDsl.g:2279:2: rule__Mass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalDsl.g:2285:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2289:1: ( ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) )
            // InternalDsl.g:2290:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            {
            // InternalDsl.g:2290:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            // InternalDsl.g:2291:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 
            // InternalDsl.g:2292:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            // InternalDsl.g:2292:3: rule__Mass__MassValueInKilogramsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mass__MassValueInKilogramsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalDsl.g:2301:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2305:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalDsl.g:2306:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalDsl.g:2313:1: rule__Inertia__Group__0__Impl : ( ( rule__Inertia__NameAssignment_0 ) ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( ( ( rule__Inertia__NameAssignment_0 ) ) )
            // InternalDsl.g:2318:1: ( ( rule__Inertia__NameAssignment_0 ) )
            {
            // InternalDsl.g:2318:1: ( ( rule__Inertia__NameAssignment_0 ) )
            // InternalDsl.g:2319:2: ( rule__Inertia__NameAssignment_0 )
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_0()); 
            // InternalDsl.g:2320:2: ( rule__Inertia__NameAssignment_0 )
            // InternalDsl.g:2320:3: rule__Inertia__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalDsl.g:2328:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2332:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalDsl.g:2333:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalDsl.g:2340:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( ( 'Inertia' ) )
            // InternalDsl.g:2345:1: ( 'Inertia' )
            {
            // InternalDsl.g:2345:1: ( 'Inertia' )
            // InternalDsl.g:2346:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalDsl.g:2355:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2359:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalDsl.g:2360:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalDsl.g:2367:1: rule__Inertia__Group__2__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2371:1: ( ( 'ixx' ) )
            // InternalDsl.g:2372:1: ( 'ixx' )
            {
            // InternalDsl.g:2372:1: ( 'ixx' )
            // InternalDsl.g:2373:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalDsl.g:2382:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2386:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalDsl.g:2387:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalDsl.g:2394:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__IxxAssignment_3 ) ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( ( ( rule__Inertia__IxxAssignment_3 ) ) )
            // InternalDsl.g:2399:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            {
            // InternalDsl.g:2399:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            // InternalDsl.g:2400:2: ( rule__Inertia__IxxAssignment_3 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 
            // InternalDsl.g:2401:2: ( rule__Inertia__IxxAssignment_3 )
            // InternalDsl.g:2401:3: rule__Inertia__IxxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalDsl.g:2409:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2413:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalDsl.g:2414:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalDsl.g:2421:1: rule__Inertia__Group__4__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( ( 'ixy' ) )
            // InternalDsl.g:2426:1: ( 'ixy' )
            {
            // InternalDsl.g:2426:1: ( 'ixy' )
            // InternalDsl.g:2427:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalDsl.g:2436:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalDsl.g:2441:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalDsl.g:2448:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__IxyAssignment_5 ) ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2452:1: ( ( ( rule__Inertia__IxyAssignment_5 ) ) )
            // InternalDsl.g:2453:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            {
            // InternalDsl.g:2453:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            // InternalDsl.g:2454:2: ( rule__Inertia__IxyAssignment_5 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 
            // InternalDsl.g:2455:2: ( rule__Inertia__IxyAssignment_5 )
            // InternalDsl.g:2455:3: rule__Inertia__IxyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalDsl.g:2463:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2467:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalDsl.g:2468:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalDsl.g:2475:1: rule__Inertia__Group__6__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( ( 'ixz' ) )
            // InternalDsl.g:2480:1: ( 'ixz' )
            {
            // InternalDsl.g:2480:1: ( 'ixz' )
            // InternalDsl.g:2481:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalDsl.g:2490:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2494:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalDsl.g:2495:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalDsl.g:2502:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__IxzAssignment_7 ) ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2506:1: ( ( ( rule__Inertia__IxzAssignment_7 ) ) )
            // InternalDsl.g:2507:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            {
            // InternalDsl.g:2507:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            // InternalDsl.g:2508:2: ( rule__Inertia__IxzAssignment_7 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 
            // InternalDsl.g:2509:2: ( rule__Inertia__IxzAssignment_7 )
            // InternalDsl.g:2509:3: rule__Inertia__IxzAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalDsl.g:2517:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2521:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalDsl.g:2522:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalDsl.g:2529:1: rule__Inertia__Group__8__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2533:1: ( ( 'iyy' ) )
            // InternalDsl.g:2534:1: ( 'iyy' )
            {
            // InternalDsl.g:2534:1: ( 'iyy' )
            // InternalDsl.g:2535:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalDsl.g:2544:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2548:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalDsl.g:2549:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Inertia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalDsl.g:2556:1: rule__Inertia__Group__9__Impl : ( ( rule__Inertia__IyyAssignment_9 ) ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( ( ( rule__Inertia__IyyAssignment_9 ) ) )
            // InternalDsl.g:2561:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            {
            // InternalDsl.g:2561:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            // InternalDsl.g:2562:2: ( rule__Inertia__IyyAssignment_9 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 
            // InternalDsl.g:2563:2: ( rule__Inertia__IyyAssignment_9 )
            // InternalDsl.g:2563:3: rule__Inertia__IyyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group__10"
    // InternalDsl.g:2571:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2575:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalDsl.g:2576:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10"


    // $ANTLR start "rule__Inertia__Group__10__Impl"
    // InternalDsl.g:2583:1: rule__Inertia__Group__10__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2587:1: ( ( 'iyz' ) )
            // InternalDsl.g:2588:1: ( 'iyz' )
            {
            // InternalDsl.g:2588:1: ( 'iyz' )
            // InternalDsl.g:2589:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10__Impl"


    // $ANTLR start "rule__Inertia__Group__11"
    // InternalDsl.g:2598:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2602:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalDsl.g:2603:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Inertia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11"


    // $ANTLR start "rule__Inertia__Group__11__Impl"
    // InternalDsl.g:2610:1: rule__Inertia__Group__11__Impl : ( ( rule__Inertia__IyzAssignment_11 ) ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2614:1: ( ( ( rule__Inertia__IyzAssignment_11 ) ) )
            // InternalDsl.g:2615:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            {
            // InternalDsl.g:2615:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            // InternalDsl.g:2616:2: ( rule__Inertia__IyzAssignment_11 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 
            // InternalDsl.g:2617:2: ( rule__Inertia__IyzAssignment_11 )
            // InternalDsl.g:2617:3: rule__Inertia__IyzAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11__Impl"


    // $ANTLR start "rule__Inertia__Group__12"
    // InternalDsl.g:2625:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2629:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalDsl.g:2630:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Inertia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12"


    // $ANTLR start "rule__Inertia__Group__12__Impl"
    // InternalDsl.g:2637:1: rule__Inertia__Group__12__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2641:1: ( ( 'izz' ) )
            // InternalDsl.g:2642:1: ( 'izz' )
            {
            // InternalDsl.g:2642:1: ( 'izz' )
            // InternalDsl.g:2643:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12__Impl"


    // $ANTLR start "rule__Inertia__Group__13"
    // InternalDsl.g:2652:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2656:1: ( rule__Inertia__Group__13__Impl )
            // InternalDsl.g:2657:2: rule__Inertia__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__13"


    // $ANTLR start "rule__Inertia__Group__13__Impl"
    // InternalDsl.g:2663:1: rule__Inertia__Group__13__Impl : ( ( rule__Inertia__IzzAssignment_13 ) ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2667:1: ( ( ( rule__Inertia__IzzAssignment_13 ) ) )
            // InternalDsl.g:2668:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            {
            // InternalDsl.g:2668:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            // InternalDsl.g:2669:2: ( rule__Inertia__IzzAssignment_13 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 
            // InternalDsl.g:2670:2: ( rule__Inertia__IzzAssignment_13 )
            // InternalDsl.g:2670:3: rule__Inertia__IzzAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__13__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalDsl.g:2679:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2683:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalDsl.g:2684:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalDsl.g:2691:1: rule__Color__Group__0__Impl : ( ( rule__Color__NameAssignment_0 ) ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( ( ( rule__Color__NameAssignment_0 ) ) )
            // InternalDsl.g:2696:1: ( ( rule__Color__NameAssignment_0 ) )
            {
            // InternalDsl.g:2696:1: ( ( rule__Color__NameAssignment_0 ) )
            // InternalDsl.g:2697:2: ( rule__Color__NameAssignment_0 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_0()); 
            // InternalDsl.g:2698:2: ( rule__Color__NameAssignment_0 )
            // InternalDsl.g:2698:3: rule__Color__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalDsl.g:2706:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2710:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalDsl.g:2711:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalDsl.g:2718:1: rule__Color__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2722:1: ( ( 'Color' ) )
            // InternalDsl.g:2723:1: ( 'Color' )
            {
            // InternalDsl.g:2723:1: ( 'Color' )
            // InternalDsl.g:2724:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalDsl.g:2733:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2737:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalDsl.g:2738:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalDsl.g:2745:1: rule__Color__Group__2__Impl : ( ( rule__Color__Group_2__0 )? ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2749:1: ( ( ( rule__Color__Group_2__0 )? ) )
            // InternalDsl.g:2750:1: ( ( rule__Color__Group_2__0 )? )
            {
            // InternalDsl.g:2750:1: ( ( rule__Color__Group_2__0 )? )
            // InternalDsl.g:2751:2: ( rule__Color__Group_2__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_2()); 
            // InternalDsl.g:2752:2: ( rule__Color__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2752:3: rule__Color__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalDsl.g:2760:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2764:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalDsl.g:2765:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalDsl.g:2772:1: rule__Color__Group__3__Impl : ( ( rule__Color__Group_3__0 )? ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2776:1: ( ( ( rule__Color__Group_3__0 )? ) )
            // InternalDsl.g:2777:1: ( ( rule__Color__Group_3__0 )? )
            {
            // InternalDsl.g:2777:1: ( ( rule__Color__Group_3__0 )? )
            // InternalDsl.g:2778:2: ( rule__Color__Group_3__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_3()); 
            // InternalDsl.g:2779:2: ( rule__Color__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2779:3: rule__Color__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalDsl.g:2787:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2791:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalDsl.g:2792:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalDsl.g:2799:1: rule__Color__Group__4__Impl : ( ( rule__Color__Group_4__0 )? ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2803:1: ( ( ( rule__Color__Group_4__0 )? ) )
            // InternalDsl.g:2804:1: ( ( rule__Color__Group_4__0 )? )
            {
            // InternalDsl.g:2804:1: ( ( rule__Color__Group_4__0 )? )
            // InternalDsl.g:2805:2: ( rule__Color__Group_4__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_4()); 
            // InternalDsl.g:2806:2: ( rule__Color__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2806:3: rule__Color__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalDsl.g:2814:1: rule__Color__Group__5 : rule__Color__Group__5__Impl ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2818:1: ( rule__Color__Group__5__Impl )
            // InternalDsl.g:2819:2: rule__Color__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalDsl.g:2825:1: rule__Color__Group__5__Impl : ( ( rule__Color__Group_5__0 )? ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2829:1: ( ( ( rule__Color__Group_5__0 )? ) )
            // InternalDsl.g:2830:1: ( ( rule__Color__Group_5__0 )? )
            {
            // InternalDsl.g:2830:1: ( ( rule__Color__Group_5__0 )? )
            // InternalDsl.g:2831:2: ( rule__Color__Group_5__0 )?
            {
             before(grammarAccess.getColorAccess().getGroup_5()); 
            // InternalDsl.g:2832:2: ( rule__Color__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2832:3: rule__Color__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group_2__0"
    // InternalDsl.g:2841:1: rule__Color__Group_2__0 : rule__Color__Group_2__0__Impl rule__Color__Group_2__1 ;
    public final void rule__Color__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2845:1: ( rule__Color__Group_2__0__Impl rule__Color__Group_2__1 )
            // InternalDsl.g:2846:2: rule__Color__Group_2__0__Impl rule__Color__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Color__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_2__0"


    // $ANTLR start "rule__Color__Group_2__0__Impl"
    // InternalDsl.g:2853:1: rule__Color__Group_2__0__Impl : ( 'red' ) ;
    public final void rule__Color__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2857:1: ( ( 'red' ) )
            // InternalDsl.g:2858:1: ( 'red' )
            {
            // InternalDsl.g:2858:1: ( 'red' )
            // InternalDsl.g:2859:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_2__0__Impl"


    // $ANTLR start "rule__Color__Group_2__1"
    // InternalDsl.g:2868:1: rule__Color__Group_2__1 : rule__Color__Group_2__1__Impl ;
    public final void rule__Color__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2872:1: ( rule__Color__Group_2__1__Impl )
            // InternalDsl.g:2873:2: rule__Color__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_2__1"


    // $ANTLR start "rule__Color__Group_2__1__Impl"
    // InternalDsl.g:2879:1: rule__Color__Group_2__1__Impl : ( ( rule__Color__RedAssignment_2_1 ) ) ;
    public final void rule__Color__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( ( ( rule__Color__RedAssignment_2_1 ) ) )
            // InternalDsl.g:2884:1: ( ( rule__Color__RedAssignment_2_1 ) )
            {
            // InternalDsl.g:2884:1: ( ( rule__Color__RedAssignment_2_1 ) )
            // InternalDsl.g:2885:2: ( rule__Color__RedAssignment_2_1 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_2_1()); 
            // InternalDsl.g:2886:2: ( rule__Color__RedAssignment_2_1 )
            // InternalDsl.g:2886:3: rule__Color__RedAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_2__1__Impl"


    // $ANTLR start "rule__Color__Group_3__0"
    // InternalDsl.g:2895:1: rule__Color__Group_3__0 : rule__Color__Group_3__0__Impl rule__Color__Group_3__1 ;
    public final void rule__Color__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2899:1: ( rule__Color__Group_3__0__Impl rule__Color__Group_3__1 )
            // InternalDsl.g:2900:2: rule__Color__Group_3__0__Impl rule__Color__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Color__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__0"


    // $ANTLR start "rule__Color__Group_3__0__Impl"
    // InternalDsl.g:2907:1: rule__Color__Group_3__0__Impl : ( 'green' ) ;
    public final void rule__Color__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2911:1: ( ( 'green' ) )
            // InternalDsl.g:2912:1: ( 'green' )
            {
            // InternalDsl.g:2912:1: ( 'green' )
            // InternalDsl.g:2913:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGreenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__0__Impl"


    // $ANTLR start "rule__Color__Group_3__1"
    // InternalDsl.g:2922:1: rule__Color__Group_3__1 : rule__Color__Group_3__1__Impl ;
    public final void rule__Color__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2926:1: ( rule__Color__Group_3__1__Impl )
            // InternalDsl.g:2927:2: rule__Color__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__1"


    // $ANTLR start "rule__Color__Group_3__1__Impl"
    // InternalDsl.g:2933:1: rule__Color__Group_3__1__Impl : ( ( rule__Color__GreenAssignment_3_1 ) ) ;
    public final void rule__Color__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2937:1: ( ( ( rule__Color__GreenAssignment_3_1 ) ) )
            // InternalDsl.g:2938:1: ( ( rule__Color__GreenAssignment_3_1 ) )
            {
            // InternalDsl.g:2938:1: ( ( rule__Color__GreenAssignment_3_1 ) )
            // InternalDsl.g:2939:2: ( rule__Color__GreenAssignment_3_1 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_3_1()); 
            // InternalDsl.g:2940:2: ( rule__Color__GreenAssignment_3_1 )
            // InternalDsl.g:2940:3: rule__Color__GreenAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_3__1__Impl"


    // $ANTLR start "rule__Color__Group_4__0"
    // InternalDsl.g:2949:1: rule__Color__Group_4__0 : rule__Color__Group_4__0__Impl rule__Color__Group_4__1 ;
    public final void rule__Color__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2953:1: ( rule__Color__Group_4__0__Impl rule__Color__Group_4__1 )
            // InternalDsl.g:2954:2: rule__Color__Group_4__0__Impl rule__Color__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Color__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__0"


    // $ANTLR start "rule__Color__Group_4__0__Impl"
    // InternalDsl.g:2961:1: rule__Color__Group_4__0__Impl : ( 'blue' ) ;
    public final void rule__Color__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2965:1: ( ( 'blue' ) )
            // InternalDsl.g:2966:1: ( 'blue' )
            {
            // InternalDsl.g:2966:1: ( 'blue' )
            // InternalDsl.g:2967:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBlueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__0__Impl"


    // $ANTLR start "rule__Color__Group_4__1"
    // InternalDsl.g:2976:1: rule__Color__Group_4__1 : rule__Color__Group_4__1__Impl ;
    public final void rule__Color__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2980:1: ( rule__Color__Group_4__1__Impl )
            // InternalDsl.g:2981:2: rule__Color__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__1"


    // $ANTLR start "rule__Color__Group_4__1__Impl"
    // InternalDsl.g:2987:1: rule__Color__Group_4__1__Impl : ( ( rule__Color__BlueAssignment_4_1 ) ) ;
    public final void rule__Color__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2991:1: ( ( ( rule__Color__BlueAssignment_4_1 ) ) )
            // InternalDsl.g:2992:1: ( ( rule__Color__BlueAssignment_4_1 ) )
            {
            // InternalDsl.g:2992:1: ( ( rule__Color__BlueAssignment_4_1 ) )
            // InternalDsl.g:2993:2: ( rule__Color__BlueAssignment_4_1 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_4_1()); 
            // InternalDsl.g:2994:2: ( rule__Color__BlueAssignment_4_1 )
            // InternalDsl.g:2994:3: rule__Color__BlueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_4__1__Impl"


    // $ANTLR start "rule__Color__Group_5__0"
    // InternalDsl.g:3003:1: rule__Color__Group_5__0 : rule__Color__Group_5__0__Impl rule__Color__Group_5__1 ;
    public final void rule__Color__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3007:1: ( rule__Color__Group_5__0__Impl rule__Color__Group_5__1 )
            // InternalDsl.g:3008:2: rule__Color__Group_5__0__Impl rule__Color__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Color__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__0"


    // $ANTLR start "rule__Color__Group_5__0__Impl"
    // InternalDsl.g:3015:1: rule__Color__Group_5__0__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( ( 'alpha' ) )
            // InternalDsl.g:3020:1: ( 'alpha' )
            {
            // InternalDsl.g:3020:1: ( 'alpha' )
            // InternalDsl.g:3021:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getAlphaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__0__Impl"


    // $ANTLR start "rule__Color__Group_5__1"
    // InternalDsl.g:3030:1: rule__Color__Group_5__1 : rule__Color__Group_5__1__Impl ;
    public final void rule__Color__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3034:1: ( rule__Color__Group_5__1__Impl )
            // InternalDsl.g:3035:2: rule__Color__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__1"


    // $ANTLR start "rule__Color__Group_5__1__Impl"
    // InternalDsl.g:3041:1: rule__Color__Group_5__1__Impl : ( ( rule__Color__AlphaAssignment_5_1 ) ) ;
    public final void rule__Color__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3045:1: ( ( ( rule__Color__AlphaAssignment_5_1 ) ) )
            // InternalDsl.g:3046:1: ( ( rule__Color__AlphaAssignment_5_1 ) )
            {
            // InternalDsl.g:3046:1: ( ( rule__Color__AlphaAssignment_5_1 ) )
            // InternalDsl.g:3047:2: ( rule__Color__AlphaAssignment_5_1 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_5_1()); 
            // InternalDsl.g:3048:2: ( rule__Color__AlphaAssignment_5_1 )
            // InternalDsl.g:3048:3: rule__Color__AlphaAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_5__1__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalDsl.g:3057:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3061:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalDsl.g:3062:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalDsl.g:3069:1: rule__Texture__Group__0__Impl : ( ( rule__Texture__NameAssignment_0 ) ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( ( ( rule__Texture__NameAssignment_0 ) ) )
            // InternalDsl.g:3074:1: ( ( rule__Texture__NameAssignment_0 ) )
            {
            // InternalDsl.g:3074:1: ( ( rule__Texture__NameAssignment_0 ) )
            // InternalDsl.g:3075:2: ( rule__Texture__NameAssignment_0 )
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_0()); 
            // InternalDsl.g:3076:2: ( rule__Texture__NameAssignment_0 )
            // InternalDsl.g:3076:3: rule__Texture__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalDsl.g:3084:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3088:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalDsl.g:3089:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Texture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalDsl.g:3096:1: rule__Texture__Group__1__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3100:1: ( ( 'Texture' ) )
            // InternalDsl.g:3101:1: ( 'Texture' )
            {
            // InternalDsl.g:3101:1: ( 'Texture' )
            // InternalDsl.g:3102:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__2"
    // InternalDsl.g:3111:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3115:1: ( rule__Texture__Group__2__Impl )
            // InternalDsl.g:3116:2: rule__Texture__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2"


    // $ANTLR start "rule__Texture__Group__2__Impl"
    // InternalDsl.g:3122:1: rule__Texture__Group__2__Impl : ( ( rule__Texture__Group_2__0 )? ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3126:1: ( ( ( rule__Texture__Group_2__0 )? ) )
            // InternalDsl.g:3127:1: ( ( rule__Texture__Group_2__0 )? )
            {
            // InternalDsl.g:3127:1: ( ( rule__Texture__Group_2__0 )? )
            // InternalDsl.g:3128:2: ( rule__Texture__Group_2__0 )?
            {
             before(grammarAccess.getTextureAccess().getGroup_2()); 
            // InternalDsl.g:3129:2: ( rule__Texture__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:3129:3: rule__Texture__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Texture__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2__Impl"


    // $ANTLR start "rule__Texture__Group_2__0"
    // InternalDsl.g:3138:1: rule__Texture__Group_2__0 : rule__Texture__Group_2__0__Impl rule__Texture__Group_2__1 ;
    public final void rule__Texture__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3142:1: ( rule__Texture__Group_2__0__Impl rule__Texture__Group_2__1 )
            // InternalDsl.g:3143:2: rule__Texture__Group_2__0__Impl rule__Texture__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Texture__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_2__0"


    // $ANTLR start "rule__Texture__Group_2__0__Impl"
    // InternalDsl.g:3150:1: rule__Texture__Group_2__0__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:3155:1: ( 'pathToFile' )
            {
            // InternalDsl.g:3155:1: ( 'pathToFile' )
            // InternalDsl.g:3156:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_2__0__Impl"


    // $ANTLR start "rule__Texture__Group_2__1"
    // InternalDsl.g:3165:1: rule__Texture__Group_2__1 : rule__Texture__Group_2__1__Impl ;
    public final void rule__Texture__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3169:1: ( rule__Texture__Group_2__1__Impl )
            // InternalDsl.g:3170:2: rule__Texture__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_2__1"


    // $ANTLR start "rule__Texture__Group_2__1__Impl"
    // InternalDsl.g:3176:1: rule__Texture__Group_2__1__Impl : ( ( rule__Texture__PathToFileAssignment_2_1 ) ) ;
    public final void rule__Texture__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3180:1: ( ( ( rule__Texture__PathToFileAssignment_2_1 ) ) )
            // InternalDsl.g:3181:1: ( ( rule__Texture__PathToFileAssignment_2_1 ) )
            {
            // InternalDsl.g:3181:1: ( ( rule__Texture__PathToFileAssignment_2_1 ) )
            // InternalDsl.g:3182:2: ( rule__Texture__PathToFileAssignment_2_1 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_2_1()); 
            // InternalDsl.g:3183:2: ( rule__Texture__PathToFileAssignment_2_1 )
            // InternalDsl.g:3183:3: rule__Texture__PathToFileAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Texture__PathToFileAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getPathToFileAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group_2__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalDsl.g:3192:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3196:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalDsl.g:3197:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalDsl.g:3204:1: rule__Box__Group__0__Impl : ( ( rule__Box__NameAssignment_0 ) ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3208:1: ( ( ( rule__Box__NameAssignment_0 ) ) )
            // InternalDsl.g:3209:1: ( ( rule__Box__NameAssignment_0 ) )
            {
            // InternalDsl.g:3209:1: ( ( rule__Box__NameAssignment_0 ) )
            // InternalDsl.g:3210:2: ( rule__Box__NameAssignment_0 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_0()); 
            // InternalDsl.g:3211:2: ( rule__Box__NameAssignment_0 )
            // InternalDsl.g:3211:3: rule__Box__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Box__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalDsl.g:3219:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3223:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalDsl.g:3224:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalDsl.g:3231:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3235:1: ( ( 'Box' ) )
            // InternalDsl.g:3236:1: ( 'Box' )
            {
            // InternalDsl.g:3236:1: ( 'Box' )
            // InternalDsl.g:3237:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalDsl.g:3246:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3250:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalDsl.g:3251:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalDsl.g:3258:1: rule__Box__Group__2__Impl : ( ( rule__Box__Group_2__0 )? ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3262:1: ( ( ( rule__Box__Group_2__0 )? ) )
            // InternalDsl.g:3263:1: ( ( rule__Box__Group_2__0 )? )
            {
            // InternalDsl.g:3263:1: ( ( rule__Box__Group_2__0 )? )
            // InternalDsl.g:3264:2: ( rule__Box__Group_2__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_2()); 
            // InternalDsl.g:3265:2: ( rule__Box__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:3265:3: rule__Box__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalDsl.g:3273:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3277:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalDsl.g:3278:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalDsl.g:3285:1: rule__Box__Group__3__Impl : ( ( rule__Box__Group_3__0 )? ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( ( ( rule__Box__Group_3__0 )? ) )
            // InternalDsl.g:3290:1: ( ( rule__Box__Group_3__0 )? )
            {
            // InternalDsl.g:3290:1: ( ( rule__Box__Group_3__0 )? )
            // InternalDsl.g:3291:2: ( rule__Box__Group_3__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_3()); 
            // InternalDsl.g:3292:2: ( rule__Box__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:3292:3: rule__Box__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalDsl.g:3300:1: rule__Box__Group__4 : rule__Box__Group__4__Impl ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3304:1: ( rule__Box__Group__4__Impl )
            // InternalDsl.g:3305:2: rule__Box__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalDsl.g:3311:1: rule__Box__Group__4__Impl : ( ( rule__Box__Group_4__0 )? ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3315:1: ( ( ( rule__Box__Group_4__0 )? ) )
            // InternalDsl.g:3316:1: ( ( rule__Box__Group_4__0 )? )
            {
            // InternalDsl.g:3316:1: ( ( rule__Box__Group_4__0 )? )
            // InternalDsl.g:3317:2: ( rule__Box__Group_4__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_4()); 
            // InternalDsl.g:3318:2: ( rule__Box__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:3318:3: rule__Box__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group_2__0"
    // InternalDsl.g:3327:1: rule__Box__Group_2__0 : rule__Box__Group_2__0__Impl rule__Box__Group_2__1 ;
    public final void rule__Box__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3331:1: ( rule__Box__Group_2__0__Impl rule__Box__Group_2__1 )
            // InternalDsl.g:3332:2: rule__Box__Group_2__0__Impl rule__Box__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Box__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_2__0"


    // $ANTLR start "rule__Box__Group_2__0__Impl"
    // InternalDsl.g:3339:1: rule__Box__Group_2__0__Impl : ( 'height' ) ;
    public final void rule__Box__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3343:1: ( ( 'height' ) )
            // InternalDsl.g:3344:1: ( 'height' )
            {
            // InternalDsl.g:3344:1: ( 'height' )
            // InternalDsl.g:3345:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_2__0__Impl"


    // $ANTLR start "rule__Box__Group_2__1"
    // InternalDsl.g:3354:1: rule__Box__Group_2__1 : rule__Box__Group_2__1__Impl ;
    public final void rule__Box__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3358:1: ( rule__Box__Group_2__1__Impl )
            // InternalDsl.g:3359:2: rule__Box__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_2__1"


    // $ANTLR start "rule__Box__Group_2__1__Impl"
    // InternalDsl.g:3365:1: rule__Box__Group_2__1__Impl : ( ( rule__Box__HeightAssignment_2_1 ) ) ;
    public final void rule__Box__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3369:1: ( ( ( rule__Box__HeightAssignment_2_1 ) ) )
            // InternalDsl.g:3370:1: ( ( rule__Box__HeightAssignment_2_1 ) )
            {
            // InternalDsl.g:3370:1: ( ( rule__Box__HeightAssignment_2_1 ) )
            // InternalDsl.g:3371:2: ( rule__Box__HeightAssignment_2_1 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_2_1()); 
            // InternalDsl.g:3372:2: ( rule__Box__HeightAssignment_2_1 )
            // InternalDsl.g:3372:3: rule__Box__HeightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_2__1__Impl"


    // $ANTLR start "rule__Box__Group_3__0"
    // InternalDsl.g:3381:1: rule__Box__Group_3__0 : rule__Box__Group_3__0__Impl rule__Box__Group_3__1 ;
    public final void rule__Box__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3385:1: ( rule__Box__Group_3__0__Impl rule__Box__Group_3__1 )
            // InternalDsl.g:3386:2: rule__Box__Group_3__0__Impl rule__Box__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Box__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__0"


    // $ANTLR start "rule__Box__Group_3__0__Impl"
    // InternalDsl.g:3393:1: rule__Box__Group_3__0__Impl : ( 'length' ) ;
    public final void rule__Box__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3397:1: ( ( 'length' ) )
            // InternalDsl.g:3398:1: ( 'length' )
            {
            // InternalDsl.g:3398:1: ( 'length' )
            // InternalDsl.g:3399:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLengthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__0__Impl"


    // $ANTLR start "rule__Box__Group_3__1"
    // InternalDsl.g:3408:1: rule__Box__Group_3__1 : rule__Box__Group_3__1__Impl ;
    public final void rule__Box__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3412:1: ( rule__Box__Group_3__1__Impl )
            // InternalDsl.g:3413:2: rule__Box__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__1"


    // $ANTLR start "rule__Box__Group_3__1__Impl"
    // InternalDsl.g:3419:1: rule__Box__Group_3__1__Impl : ( ( rule__Box__LengthAssignment_3_1 ) ) ;
    public final void rule__Box__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3423:1: ( ( ( rule__Box__LengthAssignment_3_1 ) ) )
            // InternalDsl.g:3424:1: ( ( rule__Box__LengthAssignment_3_1 ) )
            {
            // InternalDsl.g:3424:1: ( ( rule__Box__LengthAssignment_3_1 ) )
            // InternalDsl.g:3425:2: ( rule__Box__LengthAssignment_3_1 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_3_1()); 
            // InternalDsl.g:3426:2: ( rule__Box__LengthAssignment_3_1 )
            // InternalDsl.g:3426:3: rule__Box__LengthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__LengthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getLengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_3__1__Impl"


    // $ANTLR start "rule__Box__Group_4__0"
    // InternalDsl.g:3435:1: rule__Box__Group_4__0 : rule__Box__Group_4__0__Impl rule__Box__Group_4__1 ;
    public final void rule__Box__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3439:1: ( rule__Box__Group_4__0__Impl rule__Box__Group_4__1 )
            // InternalDsl.g:3440:2: rule__Box__Group_4__0__Impl rule__Box__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Box__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0"


    // $ANTLR start "rule__Box__Group_4__0__Impl"
    // InternalDsl.g:3447:1: rule__Box__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__Box__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3451:1: ( ( 'width' ) )
            // InternalDsl.g:3452:1: ( 'width' )
            {
            // InternalDsl.g:3452:1: ( 'width' )
            // InternalDsl.g:3453:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getWidthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0__Impl"


    // $ANTLR start "rule__Box__Group_4__1"
    // InternalDsl.g:3462:1: rule__Box__Group_4__1 : rule__Box__Group_4__1__Impl ;
    public final void rule__Box__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3466:1: ( rule__Box__Group_4__1__Impl )
            // InternalDsl.g:3467:2: rule__Box__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1"


    // $ANTLR start "rule__Box__Group_4__1__Impl"
    // InternalDsl.g:3473:1: rule__Box__Group_4__1__Impl : ( ( rule__Box__WidthAssignment_4_1 ) ) ;
    public final void rule__Box__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3477:1: ( ( ( rule__Box__WidthAssignment_4_1 ) ) )
            // InternalDsl.g:3478:1: ( ( rule__Box__WidthAssignment_4_1 ) )
            {
            // InternalDsl.g:3478:1: ( ( rule__Box__WidthAssignment_4_1 ) )
            // InternalDsl.g:3479:2: ( rule__Box__WidthAssignment_4_1 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_4_1()); 
            // InternalDsl.g:3480:2: ( rule__Box__WidthAssignment_4_1 )
            // InternalDsl.g:3480:3: rule__Box__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalDsl.g:3489:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3493:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalDsl.g:3494:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalDsl.g:3501:1: rule__Cylinder__Group__0__Impl : ( ( rule__Cylinder__NameAssignment_0 ) ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3505:1: ( ( ( rule__Cylinder__NameAssignment_0 ) ) )
            // InternalDsl.g:3506:1: ( ( rule__Cylinder__NameAssignment_0 ) )
            {
            // InternalDsl.g:3506:1: ( ( rule__Cylinder__NameAssignment_0 ) )
            // InternalDsl.g:3507:2: ( rule__Cylinder__NameAssignment_0 )
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_0()); 
            // InternalDsl.g:3508:2: ( rule__Cylinder__NameAssignment_0 )
            // InternalDsl.g:3508:3: rule__Cylinder__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalDsl.g:3516:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3520:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalDsl.g:3521:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalDsl.g:3528:1: rule__Cylinder__Group__1__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3532:1: ( ( 'Cylinder' ) )
            // InternalDsl.g:3533:1: ( 'Cylinder' )
            {
            // InternalDsl.g:3533:1: ( 'Cylinder' )
            // InternalDsl.g:3534:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalDsl.g:3543:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3547:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalDsl.g:3548:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalDsl.g:3555:1: rule__Cylinder__Group__2__Impl : ( ( rule__Cylinder__Group_2__0 )? ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( ( ( rule__Cylinder__Group_2__0 )? ) )
            // InternalDsl.g:3560:1: ( ( rule__Cylinder__Group_2__0 )? )
            {
            // InternalDsl.g:3560:1: ( ( rule__Cylinder__Group_2__0 )? )
            // InternalDsl.g:3561:2: ( rule__Cylinder__Group_2__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_2()); 
            // InternalDsl.g:3562:2: ( rule__Cylinder__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3562:3: rule__Cylinder__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalDsl.g:3570:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3574:1: ( rule__Cylinder__Group__3__Impl )
            // InternalDsl.g:3575:2: rule__Cylinder__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalDsl.g:3581:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__Group_3__0 )? ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( ( ( rule__Cylinder__Group_3__0 )? ) )
            // InternalDsl.g:3586:1: ( ( rule__Cylinder__Group_3__0 )? )
            {
            // InternalDsl.g:3586:1: ( ( rule__Cylinder__Group_3__0 )? )
            // InternalDsl.g:3587:2: ( rule__Cylinder__Group_3__0 )?
            {
             before(grammarAccess.getCylinderAccess().getGroup_3()); 
            // InternalDsl.g:3588:2: ( rule__Cylinder__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3588:3: rule__Cylinder__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group_2__0"
    // InternalDsl.g:3597:1: rule__Cylinder__Group_2__0 : rule__Cylinder__Group_2__0__Impl rule__Cylinder__Group_2__1 ;
    public final void rule__Cylinder__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3601:1: ( rule__Cylinder__Group_2__0__Impl rule__Cylinder__Group_2__1 )
            // InternalDsl.g:3602:2: rule__Cylinder__Group_2__0__Impl rule__Cylinder__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Cylinder__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_2__0"


    // $ANTLR start "rule__Cylinder__Group_2__0__Impl"
    // InternalDsl.g:3609:1: rule__Cylinder__Group_2__0__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( ( 'radius' ) )
            // InternalDsl.g:3614:1: ( 'radius' )
            {
            // InternalDsl.g:3614:1: ( 'radius' )
            // InternalDsl.g:3615:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_2__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_2__1"
    // InternalDsl.g:3624:1: rule__Cylinder__Group_2__1 : rule__Cylinder__Group_2__1__Impl ;
    public final void rule__Cylinder__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3628:1: ( rule__Cylinder__Group_2__1__Impl )
            // InternalDsl.g:3629:2: rule__Cylinder__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_2__1"


    // $ANTLR start "rule__Cylinder__Group_2__1__Impl"
    // InternalDsl.g:3635:1: rule__Cylinder__Group_2__1__Impl : ( ( rule__Cylinder__RadiusAssignment_2_1 ) ) ;
    public final void rule__Cylinder__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3639:1: ( ( ( rule__Cylinder__RadiusAssignment_2_1 ) ) )
            // InternalDsl.g:3640:1: ( ( rule__Cylinder__RadiusAssignment_2_1 ) )
            {
            // InternalDsl.g:3640:1: ( ( rule__Cylinder__RadiusAssignment_2_1 ) )
            // InternalDsl.g:3641:2: ( rule__Cylinder__RadiusAssignment_2_1 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_2_1()); 
            // InternalDsl.g:3642:2: ( rule__Cylinder__RadiusAssignment_2_1 )
            // InternalDsl.g:3642:3: rule__Cylinder__RadiusAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_2__1__Impl"


    // $ANTLR start "rule__Cylinder__Group_3__0"
    // InternalDsl.g:3651:1: rule__Cylinder__Group_3__0 : rule__Cylinder__Group_3__0__Impl rule__Cylinder__Group_3__1 ;
    public final void rule__Cylinder__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3655:1: ( rule__Cylinder__Group_3__0__Impl rule__Cylinder__Group_3__1 )
            // InternalDsl.g:3656:2: rule__Cylinder__Group_3__0__Impl rule__Cylinder__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Cylinder__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_3__0"


    // $ANTLR start "rule__Cylinder__Group_3__0__Impl"
    // InternalDsl.g:3663:1: rule__Cylinder__Group_3__0__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3667:1: ( ( 'length' ) )
            // InternalDsl.g:3668:1: ( 'length' )
            {
            // InternalDsl.g:3668:1: ( 'length' )
            // InternalDsl.g:3669:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_3__0__Impl"


    // $ANTLR start "rule__Cylinder__Group_3__1"
    // InternalDsl.g:3678:1: rule__Cylinder__Group_3__1 : rule__Cylinder__Group_3__1__Impl ;
    public final void rule__Cylinder__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3682:1: ( rule__Cylinder__Group_3__1__Impl )
            // InternalDsl.g:3683:2: rule__Cylinder__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_3__1"


    // $ANTLR start "rule__Cylinder__Group_3__1__Impl"
    // InternalDsl.g:3689:1: rule__Cylinder__Group_3__1__Impl : ( ( rule__Cylinder__LengthAssignment_3_1 ) ) ;
    public final void rule__Cylinder__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3693:1: ( ( ( rule__Cylinder__LengthAssignment_3_1 ) ) )
            // InternalDsl.g:3694:1: ( ( rule__Cylinder__LengthAssignment_3_1 ) )
            {
            // InternalDsl.g:3694:1: ( ( rule__Cylinder__LengthAssignment_3_1 ) )
            // InternalDsl.g:3695:2: ( rule__Cylinder__LengthAssignment_3_1 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_3_1()); 
            // InternalDsl.g:3696:2: ( rule__Cylinder__LengthAssignment_3_1 )
            // InternalDsl.g:3696:3: rule__Cylinder__LengthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group_3__1__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalDsl.g:3705:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3709:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalDsl.g:3710:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalDsl.g:3717:1: rule__Mesh__Group__0__Impl : ( ( rule__Mesh__NameAssignment_0 ) ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( ( ( rule__Mesh__NameAssignment_0 ) ) )
            // InternalDsl.g:3722:1: ( ( rule__Mesh__NameAssignment_0 ) )
            {
            // InternalDsl.g:3722:1: ( ( rule__Mesh__NameAssignment_0 ) )
            // InternalDsl.g:3723:2: ( rule__Mesh__NameAssignment_0 )
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_0()); 
            // InternalDsl.g:3724:2: ( rule__Mesh__NameAssignment_0 )
            // InternalDsl.g:3724:3: rule__Mesh__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalDsl.g:3732:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3736:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalDsl.g:3737:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalDsl.g:3744:1: rule__Mesh__Group__1__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( ( 'Mesh' ) )
            // InternalDsl.g:3749:1: ( 'Mesh' )
            {
            // InternalDsl.g:3749:1: ( 'Mesh' )
            // InternalDsl.g:3750:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalDsl.g:3759:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3763:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalDsl.g:3764:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalDsl.g:3771:1: rule__Mesh__Group__2__Impl : ( ( rule__Mesh__Group_2__0 )? ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3775:1: ( ( ( rule__Mesh__Group_2__0 )? ) )
            // InternalDsl.g:3776:1: ( ( rule__Mesh__Group_2__0 )? )
            {
            // InternalDsl.g:3776:1: ( ( rule__Mesh__Group_2__0 )? )
            // InternalDsl.g:3777:2: ( rule__Mesh__Group_2__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_2()); 
            // InternalDsl.g:3778:2: ( rule__Mesh__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3778:3: rule__Mesh__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalDsl.g:3786:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3790:1: ( rule__Mesh__Group__3__Impl )
            // InternalDsl.g:3791:2: rule__Mesh__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalDsl.g:3797:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__Group_3__0 )? ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3801:1: ( ( ( rule__Mesh__Group_3__0 )? ) )
            // InternalDsl.g:3802:1: ( ( rule__Mesh__Group_3__0 )? )
            {
            // InternalDsl.g:3802:1: ( ( rule__Mesh__Group_3__0 )? )
            // InternalDsl.g:3803:2: ( rule__Mesh__Group_3__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_3()); 
            // InternalDsl.g:3804:2: ( rule__Mesh__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3804:3: rule__Mesh__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group_2__0"
    // InternalDsl.g:3813:1: rule__Mesh__Group_2__0 : rule__Mesh__Group_2__0__Impl rule__Mesh__Group_2__1 ;
    public final void rule__Mesh__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3817:1: ( rule__Mesh__Group_2__0__Impl rule__Mesh__Group_2__1 )
            // InternalDsl.g:3818:2: rule__Mesh__Group_2__0__Impl rule__Mesh__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Mesh__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_2__0"


    // $ANTLR start "rule__Mesh__Group_2__0__Impl"
    // InternalDsl.g:3825:1: rule__Mesh__Group_2__0__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3829:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:3830:1: ( 'pathToFile' )
            {
            // InternalDsl.g:3830:1: ( 'pathToFile' )
            // InternalDsl.g:3831:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_2__0__Impl"


    // $ANTLR start "rule__Mesh__Group_2__1"
    // InternalDsl.g:3840:1: rule__Mesh__Group_2__1 : rule__Mesh__Group_2__1__Impl ;
    public final void rule__Mesh__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3844:1: ( rule__Mesh__Group_2__1__Impl )
            // InternalDsl.g:3845:2: rule__Mesh__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_2__1"


    // $ANTLR start "rule__Mesh__Group_2__1__Impl"
    // InternalDsl.g:3851:1: rule__Mesh__Group_2__1__Impl : ( ( rule__Mesh__PathToFileAssignment_2_1 ) ) ;
    public final void rule__Mesh__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3855:1: ( ( ( rule__Mesh__PathToFileAssignment_2_1 ) ) )
            // InternalDsl.g:3856:1: ( ( rule__Mesh__PathToFileAssignment_2_1 ) )
            {
            // InternalDsl.g:3856:1: ( ( rule__Mesh__PathToFileAssignment_2_1 ) )
            // InternalDsl.g:3857:2: ( rule__Mesh__PathToFileAssignment_2_1 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_2_1()); 
            // InternalDsl.g:3858:2: ( rule__Mesh__PathToFileAssignment_2_1 )
            // InternalDsl.g:3858:3: rule__Mesh__PathToFileAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__PathToFileAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getPathToFileAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_2__1__Impl"


    // $ANTLR start "rule__Mesh__Group_3__0"
    // InternalDsl.g:3867:1: rule__Mesh__Group_3__0 : rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 ;
    public final void rule__Mesh__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3871:1: ( rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1 )
            // InternalDsl.g:3872:2: rule__Mesh__Group_3__0__Impl rule__Mesh__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Mesh__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__0"


    // $ANTLR start "rule__Mesh__Group_3__0__Impl"
    // InternalDsl.g:3879:1: rule__Mesh__Group_3__0__Impl : ( 'box' ) ;
    public final void rule__Mesh__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3883:1: ( ( 'box' ) )
            // InternalDsl.g:3884:1: ( 'box' )
            {
            // InternalDsl.g:3884:1: ( 'box' )
            // InternalDsl.g:3885:2: 'box'
            {
             before(grammarAccess.getMeshAccess().getBoxKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getBoxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__0__Impl"


    // $ANTLR start "rule__Mesh__Group_3__1"
    // InternalDsl.g:3894:1: rule__Mesh__Group_3__1 : rule__Mesh__Group_3__1__Impl ;
    public final void rule__Mesh__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3898:1: ( rule__Mesh__Group_3__1__Impl )
            // InternalDsl.g:3899:2: rule__Mesh__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__1"


    // $ANTLR start "rule__Mesh__Group_3__1__Impl"
    // InternalDsl.g:3905:1: rule__Mesh__Group_3__1__Impl : ( ( rule__Mesh__BoxAssignment_3_1 ) ) ;
    public final void rule__Mesh__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3909:1: ( ( ( rule__Mesh__BoxAssignment_3_1 ) ) )
            // InternalDsl.g:3910:1: ( ( rule__Mesh__BoxAssignment_3_1 ) )
            {
            // InternalDsl.g:3910:1: ( ( rule__Mesh__BoxAssignment_3_1 ) )
            // InternalDsl.g:3911:2: ( rule__Mesh__BoxAssignment_3_1 )
            {
             before(grammarAccess.getMeshAccess().getBoxAssignment_3_1()); 
            // InternalDsl.g:3912:2: ( rule__Mesh__BoxAssignment_3_1 )
            // InternalDsl.g:3912:3: rule__Mesh__BoxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__BoxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getBoxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_3__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalDsl.g:3921:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3925:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalDsl.g:3926:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalDsl.g:3933:1: rule__Sphere__Group__0__Impl : ( ( rule__Sphere__NameAssignment_0 ) ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3937:1: ( ( ( rule__Sphere__NameAssignment_0 ) ) )
            // InternalDsl.g:3938:1: ( ( rule__Sphere__NameAssignment_0 ) )
            {
            // InternalDsl.g:3938:1: ( ( rule__Sphere__NameAssignment_0 ) )
            // InternalDsl.g:3939:2: ( rule__Sphere__NameAssignment_0 )
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_0()); 
            // InternalDsl.g:3940:2: ( rule__Sphere__NameAssignment_0 )
            // InternalDsl.g:3940:3: rule__Sphere__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalDsl.g:3948:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3952:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalDsl.g:3953:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalDsl.g:3960:1: rule__Sphere__Group__1__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3964:1: ( ( 'Sphere' ) )
            // InternalDsl.g:3965:1: ( 'Sphere' )
            {
            // InternalDsl.g:3965:1: ( 'Sphere' )
            // InternalDsl.g:3966:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalDsl.g:3975:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3979:1: ( rule__Sphere__Group__2__Impl )
            // InternalDsl.g:3980:2: rule__Sphere__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalDsl.g:3986:1: rule__Sphere__Group__2__Impl : ( ( rule__Sphere__Group_2__0 )? ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3990:1: ( ( ( rule__Sphere__Group_2__0 )? ) )
            // InternalDsl.g:3991:1: ( ( rule__Sphere__Group_2__0 )? )
            {
            // InternalDsl.g:3991:1: ( ( rule__Sphere__Group_2__0 )? )
            // InternalDsl.g:3992:2: ( rule__Sphere__Group_2__0 )?
            {
             before(grammarAccess.getSphereAccess().getGroup_2()); 
            // InternalDsl.g:3993:2: ( rule__Sphere__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:3993:3: rule__Sphere__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group_2__0"
    // InternalDsl.g:4002:1: rule__Sphere__Group_2__0 : rule__Sphere__Group_2__0__Impl rule__Sphere__Group_2__1 ;
    public final void rule__Sphere__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4006:1: ( rule__Sphere__Group_2__0__Impl rule__Sphere__Group_2__1 )
            // InternalDsl.g:4007:2: rule__Sphere__Group_2__0__Impl rule__Sphere__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Sphere__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_2__0"


    // $ANTLR start "rule__Sphere__Group_2__0__Impl"
    // InternalDsl.g:4014:1: rule__Sphere__Group_2__0__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4018:1: ( ( 'radius' ) )
            // InternalDsl.g:4019:1: ( 'radius' )
            {
            // InternalDsl.g:4019:1: ( 'radius' )
            // InternalDsl.g:4020:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_2__0__Impl"


    // $ANTLR start "rule__Sphere__Group_2__1"
    // InternalDsl.g:4029:1: rule__Sphere__Group_2__1 : rule__Sphere__Group_2__1__Impl ;
    public final void rule__Sphere__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4033:1: ( rule__Sphere__Group_2__1__Impl )
            // InternalDsl.g:4034:2: rule__Sphere__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_2__1"


    // $ANTLR start "rule__Sphere__Group_2__1__Impl"
    // InternalDsl.g:4040:1: rule__Sphere__Group_2__1__Impl : ( ( rule__Sphere__RadiusAssignment_2_1 ) ) ;
    public final void rule__Sphere__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4044:1: ( ( ( rule__Sphere__RadiusAssignment_2_1 ) ) )
            // InternalDsl.g:4045:1: ( ( rule__Sphere__RadiusAssignment_2_1 ) )
            {
            // InternalDsl.g:4045:1: ( ( rule__Sphere__RadiusAssignment_2_1 ) )
            // InternalDsl.g:4046:2: ( rule__Sphere__RadiusAssignment_2_1 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_2_1()); 
            // InternalDsl.g:4047:2: ( rule__Sphere__RadiusAssignment_2_1 )
            // InternalDsl.g:4047:3: rule__Sphere__RadiusAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group_2__1__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalDsl.g:4056:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4060:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalDsl.g:4061:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalDsl.g:4068:1: rule__Limit__Group__0__Impl : ( ( rule__Limit__NameAssignment_0 ) ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4072:1: ( ( ( rule__Limit__NameAssignment_0 ) ) )
            // InternalDsl.g:4073:1: ( ( rule__Limit__NameAssignment_0 ) )
            {
            // InternalDsl.g:4073:1: ( ( rule__Limit__NameAssignment_0 ) )
            // InternalDsl.g:4074:2: ( rule__Limit__NameAssignment_0 )
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_0()); 
            // InternalDsl.g:4075:2: ( rule__Limit__NameAssignment_0 )
            // InternalDsl.g:4075:3: rule__Limit__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalDsl.g:4083:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4087:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalDsl.g:4088:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalDsl.g:4095:1: rule__Limit__Group__1__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4099:1: ( ( 'Limit' ) )
            // InternalDsl.g:4100:1: ( 'Limit' )
            {
            // InternalDsl.g:4100:1: ( 'Limit' )
            // InternalDsl.g:4101:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLimitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalDsl.g:4110:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4114:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalDsl.g:4115:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalDsl.g:4122:1: rule__Limit__Group__2__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4126:1: ( ( 'lower' ) )
            // InternalDsl.g:4127:1: ( 'lower' )
            {
            // InternalDsl.g:4127:1: ( 'lower' )
            // InternalDsl.g:4128:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalDsl.g:4137:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4141:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalDsl.g:4142:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalDsl.g:4149:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__LowerAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4153:1: ( ( ( rule__Limit__LowerAssignment_3 ) ) )
            // InternalDsl.g:4154:1: ( ( rule__Limit__LowerAssignment_3 ) )
            {
            // InternalDsl.g:4154:1: ( ( rule__Limit__LowerAssignment_3 ) )
            // InternalDsl.g:4155:2: ( rule__Limit__LowerAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_3()); 
            // InternalDsl.g:4156:2: ( rule__Limit__LowerAssignment_3 )
            // InternalDsl.g:4156:3: rule__Limit__LowerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalDsl.g:4164:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4168:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalDsl.g:4169:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalDsl.g:4176:1: rule__Limit__Group__4__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4180:1: ( ( 'upper' ) )
            // InternalDsl.g:4181:1: ( 'upper' )
            {
            // InternalDsl.g:4181:1: ( 'upper' )
            // InternalDsl.g:4182:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalDsl.g:4191:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4195:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalDsl.g:4196:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalDsl.g:4203:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__UpperAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4207:1: ( ( ( rule__Limit__UpperAssignment_5 ) ) )
            // InternalDsl.g:4208:1: ( ( rule__Limit__UpperAssignment_5 ) )
            {
            // InternalDsl.g:4208:1: ( ( rule__Limit__UpperAssignment_5 ) )
            // InternalDsl.g:4209:2: ( rule__Limit__UpperAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_5()); 
            // InternalDsl.g:4210:2: ( rule__Limit__UpperAssignment_5 )
            // InternalDsl.g:4210:3: rule__Limit__UpperAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalDsl.g:4218:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4222:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalDsl.g:4223:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Limit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalDsl.g:4230:1: rule__Limit__Group__6__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4234:1: ( ( 'effort' ) )
            // InternalDsl.g:4235:1: ( 'effort' )
            {
            // InternalDsl.g:4235:1: ( 'effort' )
            // InternalDsl.g:4236:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group__7"
    // InternalDsl.g:4245:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4249:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalDsl.g:4250:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Limit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7"


    // $ANTLR start "rule__Limit__Group__7__Impl"
    // InternalDsl.g:4257:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__EffortAssignment_7 ) ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4261:1: ( ( ( rule__Limit__EffortAssignment_7 ) ) )
            // InternalDsl.g:4262:1: ( ( rule__Limit__EffortAssignment_7 ) )
            {
            // InternalDsl.g:4262:1: ( ( rule__Limit__EffortAssignment_7 ) )
            // InternalDsl.g:4263:2: ( rule__Limit__EffortAssignment_7 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_7()); 
            // InternalDsl.g:4264:2: ( rule__Limit__EffortAssignment_7 )
            // InternalDsl.g:4264:3: rule__Limit__EffortAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group__8"
    // InternalDsl.g:4272:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl rule__Limit__Group__9 ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4276:1: ( rule__Limit__Group__8__Impl rule__Limit__Group__9 )
            // InternalDsl.g:4277:2: rule__Limit__Group__8__Impl rule__Limit__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Limit__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8"


    // $ANTLR start "rule__Limit__Group__8__Impl"
    // InternalDsl.g:4284:1: rule__Limit__Group__8__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4288:1: ( ( 'velocity' ) )
            // InternalDsl.g:4289:1: ( 'velocity' )
            {
            // InternalDsl.g:4289:1: ( 'velocity' )
            // InternalDsl.g:4290:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_8()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8__Impl"


    // $ANTLR start "rule__Limit__Group__9"
    // InternalDsl.g:4299:1: rule__Limit__Group__9 : rule__Limit__Group__9__Impl ;
    public final void rule__Limit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4303:1: ( rule__Limit__Group__9__Impl )
            // InternalDsl.g:4304:2: rule__Limit__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__9"


    // $ANTLR start "rule__Limit__Group__9__Impl"
    // InternalDsl.g:4310:1: rule__Limit__Group__9__Impl : ( ( rule__Limit__VelocityAssignment_9 ) ) ;
    public final void rule__Limit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4314:1: ( ( ( rule__Limit__VelocityAssignment_9 ) ) )
            // InternalDsl.g:4315:1: ( ( rule__Limit__VelocityAssignment_9 ) )
            {
            // InternalDsl.g:4315:1: ( ( rule__Limit__VelocityAssignment_9 ) )
            // InternalDsl.g:4316:2: ( rule__Limit__VelocityAssignment_9 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_9()); 
            // InternalDsl.g:4317:2: ( rule__Limit__VelocityAssignment_9 )
            // InternalDsl.g:4317:3: rule__Limit__VelocityAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__9__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalDsl.g:4326:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4330:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalDsl.g:4331:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalDsl.g:4338:1: rule__Axis__Group__0__Impl : ( ( rule__Axis__NameAssignment_0 ) ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4342:1: ( ( ( rule__Axis__NameAssignment_0 ) ) )
            // InternalDsl.g:4343:1: ( ( rule__Axis__NameAssignment_0 ) )
            {
            // InternalDsl.g:4343:1: ( ( rule__Axis__NameAssignment_0 ) )
            // InternalDsl.g:4344:2: ( rule__Axis__NameAssignment_0 )
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_0()); 
            // InternalDsl.g:4345:2: ( rule__Axis__NameAssignment_0 )
            // InternalDsl.g:4345:3: rule__Axis__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalDsl.g:4353:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4357:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalDsl.g:4358:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalDsl.g:4365:1: rule__Axis__Group__1__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4369:1: ( ( 'Axis' ) )
            // InternalDsl.g:4370:1: ( 'Axis' )
            {
            // InternalDsl.g:4370:1: ( 'Axis' )
            // InternalDsl.g:4371:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getAxisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalDsl.g:4380:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4384:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalDsl.g:4385:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalDsl.g:4392:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4396:1: ( ( 'x' ) )
            // InternalDsl.g:4397:1: ( 'x' )
            {
            // InternalDsl.g:4397:1: ( 'x' )
            // InternalDsl.g:4398:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalDsl.g:4407:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4411:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalDsl.g:4412:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalDsl.g:4419:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4423:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalDsl.g:4424:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalDsl.g:4424:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalDsl.g:4425:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalDsl.g:4426:2: ( rule__Axis__XAssignment_3 )
            // InternalDsl.g:4426:3: rule__Axis__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group__4"
    // InternalDsl.g:4434:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4438:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalDsl.g:4439:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Axis__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalDsl.g:4446:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4450:1: ( ( 'y' ) )
            // InternalDsl.g:4451:1: ( 'y' )
            {
            // InternalDsl.g:4451:1: ( 'y' )
            // InternalDsl.g:4452:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Axis__Group__5"
    // InternalDsl.g:4461:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4465:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalDsl.g:4466:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__Axis__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__5"


    // $ANTLR start "rule__Axis__Group__5__Impl"
    // InternalDsl.g:4473:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4477:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalDsl.g:4478:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalDsl.g:4478:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalDsl.g:4479:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalDsl.g:4480:2: ( rule__Axis__YAssignment_5 )
            // InternalDsl.g:4480:3: rule__Axis__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__5__Impl"


    // $ANTLR start "rule__Axis__Group__6"
    // InternalDsl.g:4488:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4492:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalDsl.g:4493:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Axis__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__6"


    // $ANTLR start "rule__Axis__Group__6__Impl"
    // InternalDsl.g:4500:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4504:1: ( ( 'z' ) )
            // InternalDsl.g:4505:1: ( 'z' )
            {
            // InternalDsl.g:4505:1: ( 'z' )
            // InternalDsl.g:4506:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__6__Impl"


    // $ANTLR start "rule__Axis__Group__7"
    // InternalDsl.g:4515:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4519:1: ( rule__Axis__Group__7__Impl )
            // InternalDsl.g:4520:2: rule__Axis__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__7"


    // $ANTLR start "rule__Axis__Group__7__Impl"
    // InternalDsl.g:4526:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4530:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalDsl.g:4531:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalDsl.g:4531:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalDsl.g:4532:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalDsl.g:4533:2: ( rule__Axis__ZAssignment_7 )
            // InternalDsl.g:4533:3: rule__Axis__ZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__7__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalDsl.g:4542:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4546:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalDsl.g:4547:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Calibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0"


    // $ANTLR start "rule__Calibration__Group__0__Impl"
    // InternalDsl.g:4554:1: rule__Calibration__Group__0__Impl : ( ( rule__Calibration__NameAssignment_0 ) ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4558:1: ( ( ( rule__Calibration__NameAssignment_0 ) ) )
            // InternalDsl.g:4559:1: ( ( rule__Calibration__NameAssignment_0 ) )
            {
            // InternalDsl.g:4559:1: ( ( rule__Calibration__NameAssignment_0 ) )
            // InternalDsl.g:4560:2: ( rule__Calibration__NameAssignment_0 )
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_0()); 
            // InternalDsl.g:4561:2: ( rule__Calibration__NameAssignment_0 )
            // InternalDsl.g:4561:3: rule__Calibration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0__Impl"


    // $ANTLR start "rule__Calibration__Group__1"
    // InternalDsl.g:4569:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4573:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalDsl.g:4574:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Calibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1"


    // $ANTLR start "rule__Calibration__Group__1__Impl"
    // InternalDsl.g:4581:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4585:1: ( ( 'Calibration' ) )
            // InternalDsl.g:4586:1: ( 'Calibration' )
            {
            // InternalDsl.g:4586:1: ( 'Calibration' )
            // InternalDsl.g:4587:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1__Impl"


    // $ANTLR start "rule__Calibration__Group__2"
    // InternalDsl.g:4596:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4600:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalDsl.g:4601:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Calibration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2"


    // $ANTLR start "rule__Calibration__Group__2__Impl"
    // InternalDsl.g:4608:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__Group_2__0 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4612:1: ( ( ( rule__Calibration__Group_2__0 )? ) )
            // InternalDsl.g:4613:1: ( ( rule__Calibration__Group_2__0 )? )
            {
            // InternalDsl.g:4613:1: ( ( rule__Calibration__Group_2__0 )? )
            // InternalDsl.g:4614:2: ( rule__Calibration__Group_2__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_2()); 
            // InternalDsl.g:4615:2: ( rule__Calibration__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==57) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:4615:3: rule__Calibration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2__Impl"


    // $ANTLR start "rule__Calibration__Group__3"
    // InternalDsl.g:4623:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4627:1: ( rule__Calibration__Group__3__Impl )
            // InternalDsl.g:4628:2: rule__Calibration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3"


    // $ANTLR start "rule__Calibration__Group__3__Impl"
    // InternalDsl.g:4634:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4638:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalDsl.g:4639:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalDsl.g:4639:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalDsl.g:4640:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalDsl.g:4641:2: ( rule__Calibration__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4641:3: rule__Calibration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3__Impl"


    // $ANTLR start "rule__Calibration__Group_2__0"
    // InternalDsl.g:4650:1: rule__Calibration__Group_2__0 : rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 ;
    public final void rule__Calibration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4654:1: ( rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 )
            // InternalDsl.g:4655:2: rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Calibration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0"


    // $ANTLR start "rule__Calibration__Group_2__0__Impl"
    // InternalDsl.g:4662:1: rule__Calibration__Group_2__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4666:1: ( ( 'rising' ) )
            // InternalDsl.g:4667:1: ( 'rising' )
            {
            // InternalDsl.g:4667:1: ( 'rising' )
            // InternalDsl.g:4668:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0__Impl"


    // $ANTLR start "rule__Calibration__Group_2__1"
    // InternalDsl.g:4677:1: rule__Calibration__Group_2__1 : rule__Calibration__Group_2__1__Impl ;
    public final void rule__Calibration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4681:1: ( rule__Calibration__Group_2__1__Impl )
            // InternalDsl.g:4682:2: rule__Calibration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1"


    // $ANTLR start "rule__Calibration__Group_2__1__Impl"
    // InternalDsl.g:4688:1: rule__Calibration__Group_2__1__Impl : ( ( rule__Calibration__RisingAssignment_2_1 ) ) ;
    public final void rule__Calibration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4692:1: ( ( ( rule__Calibration__RisingAssignment_2_1 ) ) )
            // InternalDsl.g:4693:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            {
            // InternalDsl.g:4693:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            // InternalDsl.g:4694:2: ( rule__Calibration__RisingAssignment_2_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 
            // InternalDsl.g:4695:2: ( rule__Calibration__RisingAssignment_2_1 )
            // InternalDsl.g:4695:3: rule__Calibration__RisingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1__Impl"


    // $ANTLR start "rule__Calibration__Group_3__0"
    // InternalDsl.g:4704:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4708:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalDsl.g:4709:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Calibration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0"


    // $ANTLR start "rule__Calibration__Group_3__0__Impl"
    // InternalDsl.g:4716:1: rule__Calibration__Group_3__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4720:1: ( ( 'falling' ) )
            // InternalDsl.g:4721:1: ( 'falling' )
            {
            // InternalDsl.g:4721:1: ( 'falling' )
            // InternalDsl.g:4722:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3__1"
    // InternalDsl.g:4731:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4735:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalDsl.g:4736:2: rule__Calibration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1"


    // $ANTLR start "rule__Calibration__Group_3__1__Impl"
    // InternalDsl.g:4742:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__FallingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4746:1: ( ( ( rule__Calibration__FallingAssignment_3_1 ) ) )
            // InternalDsl.g:4747:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            {
            // InternalDsl.g:4747:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            // InternalDsl.g:4748:2: ( rule__Calibration__FallingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 
            // InternalDsl.g:4749:2: ( rule__Calibration__FallingAssignment_3_1 )
            // InternalDsl.g:4749:3: rule__Calibration__FallingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalDsl.g:4758:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4762:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalDsl.g:4763:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Dynamics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0"


    // $ANTLR start "rule__Dynamics__Group__0__Impl"
    // InternalDsl.g:4770:1: rule__Dynamics__Group__0__Impl : ( ( rule__Dynamics__NameAssignment_0 ) ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4774:1: ( ( ( rule__Dynamics__NameAssignment_0 ) ) )
            // InternalDsl.g:4775:1: ( ( rule__Dynamics__NameAssignment_0 ) )
            {
            // InternalDsl.g:4775:1: ( ( rule__Dynamics__NameAssignment_0 ) )
            // InternalDsl.g:4776:2: ( rule__Dynamics__NameAssignment_0 )
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_0()); 
            // InternalDsl.g:4777:2: ( rule__Dynamics__NameAssignment_0 )
            // InternalDsl.g:4777:3: rule__Dynamics__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalDsl.g:4785:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4789:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalDsl.g:4790:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Dynamics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1"


    // $ANTLR start "rule__Dynamics__Group__1__Impl"
    // InternalDsl.g:4797:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4801:1: ( ( 'Dynamics' ) )
            // InternalDsl.g:4802:1: ( 'Dynamics' )
            {
            // InternalDsl.g:4802:1: ( 'Dynamics' )
            // InternalDsl.g:4803:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__2"
    // InternalDsl.g:4812:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4816:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalDsl.g:4817:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Dynamics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2"


    // $ANTLR start "rule__Dynamics__Group__2__Impl"
    // InternalDsl.g:4824:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__Group_2__0 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4828:1: ( ( ( rule__Dynamics__Group_2__0 )? ) )
            // InternalDsl.g:4829:1: ( ( rule__Dynamics__Group_2__0 )? )
            {
            // InternalDsl.g:4829:1: ( ( rule__Dynamics__Group_2__0 )? )
            // InternalDsl.g:4830:2: ( rule__Dynamics__Group_2__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_2()); 
            // InternalDsl.g:4831:2: ( rule__Dynamics__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==60) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4831:3: rule__Dynamics__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2__Impl"


    // $ANTLR start "rule__Dynamics__Group__3"
    // InternalDsl.g:4839:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4843:1: ( rule__Dynamics__Group__3__Impl )
            // InternalDsl.g:4844:2: rule__Dynamics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3"


    // $ANTLR start "rule__Dynamics__Group__3__Impl"
    // InternalDsl.g:4850:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4854:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalDsl.g:4855:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalDsl.g:4855:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalDsl.g:4856:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalDsl.g:4857:2: ( rule__Dynamics__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:4857:3: rule__Dynamics__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__0"
    // InternalDsl.g:4866:1: rule__Dynamics__Group_2__0 : rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 ;
    public final void rule__Dynamics__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4870:1: ( rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 )
            // InternalDsl.g:4871:2: rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Dynamics__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0"


    // $ANTLR start "rule__Dynamics__Group_2__0__Impl"
    // InternalDsl.g:4878:1: rule__Dynamics__Group_2__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4882:1: ( ( 'friction' ) )
            // InternalDsl.g:4883:1: ( 'friction' )
            {
            // InternalDsl.g:4883:1: ( 'friction' )
            // InternalDsl.g:4884:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__1"
    // InternalDsl.g:4893:1: rule__Dynamics__Group_2__1 : rule__Dynamics__Group_2__1__Impl ;
    public final void rule__Dynamics__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4897:1: ( rule__Dynamics__Group_2__1__Impl )
            // InternalDsl.g:4898:2: rule__Dynamics__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1"


    // $ANTLR start "rule__Dynamics__Group_2__1__Impl"
    // InternalDsl.g:4904:1: rule__Dynamics__Group_2__1__Impl : ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) ;
    public final void rule__Dynamics__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4908:1: ( ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) )
            // InternalDsl.g:4909:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            {
            // InternalDsl.g:4909:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            // InternalDsl.g:4910:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 
            // InternalDsl.g:4911:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            // InternalDsl.g:4911:3: rule__Dynamics__FrictionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__0"
    // InternalDsl.g:4920:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4924:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalDsl.g:4925:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Dynamics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0"


    // $ANTLR start "rule__Dynamics__Group_3__0__Impl"
    // InternalDsl.g:4932:1: rule__Dynamics__Group_3__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4936:1: ( ( 'damping' ) )
            // InternalDsl.g:4937:1: ( 'damping' )
            {
            // InternalDsl.g:4937:1: ( 'damping' )
            // InternalDsl.g:4938:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__1"
    // InternalDsl.g:4947:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4951:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalDsl.g:4952:2: rule__Dynamics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1"


    // $ANTLR start "rule__Dynamics__Group_3__1__Impl"
    // InternalDsl.g:4958:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__DampingAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4962:1: ( ( ( rule__Dynamics__DampingAssignment_3_1 ) ) )
            // InternalDsl.g:4963:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            {
            // InternalDsl.g:4963:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            // InternalDsl.g:4964:2: ( rule__Dynamics__DampingAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 
            // InternalDsl.g:4965:2: ( rule__Dynamics__DampingAssignment_3_1 )
            // InternalDsl.g:4965:3: rule__Dynamics__DampingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group__0"
    // InternalDsl.g:4974:1: rule__Mimic__Group__0 : rule__Mimic__Group__0__Impl rule__Mimic__Group__1 ;
    public final void rule__Mimic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4978:1: ( rule__Mimic__Group__0__Impl rule__Mimic__Group__1 )
            // InternalDsl.g:4979:2: rule__Mimic__Group__0__Impl rule__Mimic__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Mimic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0"


    // $ANTLR start "rule__Mimic__Group__0__Impl"
    // InternalDsl.g:4986:1: rule__Mimic__Group__0__Impl : ( ( rule__Mimic__NameAssignment_0 ) ) ;
    public final void rule__Mimic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4990:1: ( ( ( rule__Mimic__NameAssignment_0 ) ) )
            // InternalDsl.g:4991:1: ( ( rule__Mimic__NameAssignment_0 ) )
            {
            // InternalDsl.g:4991:1: ( ( rule__Mimic__NameAssignment_0 ) )
            // InternalDsl.g:4992:2: ( rule__Mimic__NameAssignment_0 )
            {
             before(grammarAccess.getMimicAccess().getNameAssignment_0()); 
            // InternalDsl.g:4993:2: ( rule__Mimic__NameAssignment_0 )
            // InternalDsl.g:4993:3: rule__Mimic__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0__Impl"


    // $ANTLR start "rule__Mimic__Group__1"
    // InternalDsl.g:5001:1: rule__Mimic__Group__1 : rule__Mimic__Group__1__Impl rule__Mimic__Group__2 ;
    public final void rule__Mimic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5005:1: ( rule__Mimic__Group__1__Impl rule__Mimic__Group__2 )
            // InternalDsl.g:5006:2: rule__Mimic__Group__1__Impl rule__Mimic__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Mimic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1"


    // $ANTLR start "rule__Mimic__Group__1__Impl"
    // InternalDsl.g:5013:1: rule__Mimic__Group__1__Impl : ( 'Mimic' ) ;
    public final void rule__Mimic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5017:1: ( ( 'Mimic' ) )
            // InternalDsl.g:5018:1: ( 'Mimic' )
            {
            // InternalDsl.g:5018:1: ( 'Mimic' )
            // InternalDsl.g:5019:2: 'Mimic'
            {
             before(grammarAccess.getMimicAccess().getMimicKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1__Impl"


    // $ANTLR start "rule__Mimic__Group__2"
    // InternalDsl.g:5028:1: rule__Mimic__Group__2 : rule__Mimic__Group__2__Impl rule__Mimic__Group__3 ;
    public final void rule__Mimic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5032:1: ( rule__Mimic__Group__2__Impl rule__Mimic__Group__3 )
            // InternalDsl.g:5033:2: rule__Mimic__Group__2__Impl rule__Mimic__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Mimic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2"


    // $ANTLR start "rule__Mimic__Group__2__Impl"
    // InternalDsl.g:5040:1: rule__Mimic__Group__2__Impl : ( ( rule__Mimic__Group_2__0 )? ) ;
    public final void rule__Mimic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5044:1: ( ( ( rule__Mimic__Group_2__0 )? ) )
            // InternalDsl.g:5045:1: ( ( rule__Mimic__Group_2__0 )? )
            {
            // InternalDsl.g:5045:1: ( ( rule__Mimic__Group_2__0 )? )
            // InternalDsl.g:5046:2: ( rule__Mimic__Group_2__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_2()); 
            // InternalDsl.g:5047:2: ( rule__Mimic__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==63) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:5047:3: rule__Mimic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2__Impl"


    // $ANTLR start "rule__Mimic__Group__3"
    // InternalDsl.g:5055:1: rule__Mimic__Group__3 : rule__Mimic__Group__3__Impl rule__Mimic__Group__4 ;
    public final void rule__Mimic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5059:1: ( rule__Mimic__Group__3__Impl rule__Mimic__Group__4 )
            // InternalDsl.g:5060:2: rule__Mimic__Group__3__Impl rule__Mimic__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Mimic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3"


    // $ANTLR start "rule__Mimic__Group__3__Impl"
    // InternalDsl.g:5067:1: rule__Mimic__Group__3__Impl : ( ( rule__Mimic__Group_3__0 )? ) ;
    public final void rule__Mimic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5071:1: ( ( ( rule__Mimic__Group_3__0 )? ) )
            // InternalDsl.g:5072:1: ( ( rule__Mimic__Group_3__0 )? )
            {
            // InternalDsl.g:5072:1: ( ( rule__Mimic__Group_3__0 )? )
            // InternalDsl.g:5073:2: ( rule__Mimic__Group_3__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_3()); 
            // InternalDsl.g:5074:2: ( rule__Mimic__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:5074:3: rule__Mimic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3__Impl"


    // $ANTLR start "rule__Mimic__Group__4"
    // InternalDsl.g:5082:1: rule__Mimic__Group__4 : rule__Mimic__Group__4__Impl ;
    public final void rule__Mimic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5086:1: ( rule__Mimic__Group__4__Impl )
            // InternalDsl.g:5087:2: rule__Mimic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4"


    // $ANTLR start "rule__Mimic__Group__4__Impl"
    // InternalDsl.g:5093:1: rule__Mimic__Group__4__Impl : ( ( rule__Mimic__Group_4__0 )? ) ;
    public final void rule__Mimic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5097:1: ( ( ( rule__Mimic__Group_4__0 )? ) )
            // InternalDsl.g:5098:1: ( ( rule__Mimic__Group_4__0 )? )
            {
            // InternalDsl.g:5098:1: ( ( rule__Mimic__Group_4__0 )? )
            // InternalDsl.g:5099:2: ( rule__Mimic__Group_4__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_4()); 
            // InternalDsl.g:5100:2: ( rule__Mimic__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:5100:3: rule__Mimic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4__Impl"


    // $ANTLR start "rule__Mimic__Group_2__0"
    // InternalDsl.g:5109:1: rule__Mimic__Group_2__0 : rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 ;
    public final void rule__Mimic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5113:1: ( rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 )
            // InternalDsl.g:5114:2: rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Mimic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__0"


    // $ANTLR start "rule__Mimic__Group_2__0__Impl"
    // InternalDsl.g:5121:1: rule__Mimic__Group_2__0__Impl : ( 'multiplier' ) ;
    public final void rule__Mimic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5125:1: ( ( 'multiplier' ) )
            // InternalDsl.g:5126:1: ( 'multiplier' )
            {
            // InternalDsl.g:5126:1: ( 'multiplier' )
            // InternalDsl.g:5127:2: 'multiplier'
            {
             before(grammarAccess.getMimicAccess().getMultiplierKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMultiplierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__0__Impl"


    // $ANTLR start "rule__Mimic__Group_2__1"
    // InternalDsl.g:5136:1: rule__Mimic__Group_2__1 : rule__Mimic__Group_2__1__Impl ;
    public final void rule__Mimic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5140:1: ( rule__Mimic__Group_2__1__Impl )
            // InternalDsl.g:5141:2: rule__Mimic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__1"


    // $ANTLR start "rule__Mimic__Group_2__1__Impl"
    // InternalDsl.g:5147:1: rule__Mimic__Group_2__1__Impl : ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) ;
    public final void rule__Mimic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5151:1: ( ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) )
            // InternalDsl.g:5152:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            {
            // InternalDsl.g:5152:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            // InternalDsl.g:5153:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            {
             before(grammarAccess.getMimicAccess().getMultiplierAssignment_2_1()); 
            // InternalDsl.g:5154:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            // InternalDsl.g:5154:3: rule__Mimic__MultiplierAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MultiplierAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMultiplierAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_2__1__Impl"


    // $ANTLR start "rule__Mimic__Group_3__0"
    // InternalDsl.g:5163:1: rule__Mimic__Group_3__0 : rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 ;
    public final void rule__Mimic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5167:1: ( rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 )
            // InternalDsl.g:5168:2: rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Mimic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0"


    // $ANTLR start "rule__Mimic__Group_3__0__Impl"
    // InternalDsl.g:5175:1: rule__Mimic__Group_3__0__Impl : ( 'offSet' ) ;
    public final void rule__Mimic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5179:1: ( ( 'offSet' ) )
            // InternalDsl.g:5180:1: ( 'offSet' )
            {
            // InternalDsl.g:5180:1: ( 'offSet' )
            // InternalDsl.g:5181:2: 'offSet'
            {
             before(grammarAccess.getMimicAccess().getOffSetKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getOffSetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0__Impl"


    // $ANTLR start "rule__Mimic__Group_3__1"
    // InternalDsl.g:5190:1: rule__Mimic__Group_3__1 : rule__Mimic__Group_3__1__Impl ;
    public final void rule__Mimic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5194:1: ( rule__Mimic__Group_3__1__Impl )
            // InternalDsl.g:5195:2: rule__Mimic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1"


    // $ANTLR start "rule__Mimic__Group_3__1__Impl"
    // InternalDsl.g:5201:1: rule__Mimic__Group_3__1__Impl : ( ( rule__Mimic__OffSetAssignment_3_1 ) ) ;
    public final void rule__Mimic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5205:1: ( ( ( rule__Mimic__OffSetAssignment_3_1 ) ) )
            // InternalDsl.g:5206:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            {
            // InternalDsl.g:5206:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            // InternalDsl.g:5207:2: ( rule__Mimic__OffSetAssignment_3_1 )
            {
             before(grammarAccess.getMimicAccess().getOffSetAssignment_3_1()); 
            // InternalDsl.g:5208:2: ( rule__Mimic__OffSetAssignment_3_1 )
            // InternalDsl.g:5208:3: rule__Mimic__OffSetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__OffSetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getOffSetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group_4__0"
    // InternalDsl.g:5217:1: rule__Mimic__Group_4__0 : rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 ;
    public final void rule__Mimic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5221:1: ( rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 )
            // InternalDsl.g:5222:2: rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Mimic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0"


    // $ANTLR start "rule__Mimic__Group_4__0__Impl"
    // InternalDsl.g:5229:1: rule__Mimic__Group_4__0__Impl : ( 'mimics' ) ;
    public final void rule__Mimic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5233:1: ( ( 'mimics' ) )
            // InternalDsl.g:5234:1: ( 'mimics' )
            {
            // InternalDsl.g:5234:1: ( 'mimics' )
            // InternalDsl.g:5235:2: 'mimics'
            {
             before(grammarAccess.getMimicAccess().getMimicsKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0__Impl"


    // $ANTLR start "rule__Mimic__Group_4__1"
    // InternalDsl.g:5244:1: rule__Mimic__Group_4__1 : rule__Mimic__Group_4__1__Impl ;
    public final void rule__Mimic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5248:1: ( rule__Mimic__Group_4__1__Impl )
            // InternalDsl.g:5249:2: rule__Mimic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1"


    // $ANTLR start "rule__Mimic__Group_4__1__Impl"
    // InternalDsl.g:5255:1: rule__Mimic__Group_4__1__Impl : ( ( rule__Mimic__MimicsAssignment_4_1 ) ) ;
    public final void rule__Mimic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5259:1: ( ( ( rule__Mimic__MimicsAssignment_4_1 ) ) )
            // InternalDsl.g:5260:1: ( ( rule__Mimic__MimicsAssignment_4_1 ) )
            {
            // InternalDsl.g:5260:1: ( ( rule__Mimic__MimicsAssignment_4_1 ) )
            // InternalDsl.g:5261:2: ( rule__Mimic__MimicsAssignment_4_1 )
            {
             before(grammarAccess.getMimicAccess().getMimicsAssignment_4_1()); 
            // InternalDsl.g:5262:2: ( rule__Mimic__MimicsAssignment_4_1 )
            // InternalDsl.g:5262:3: rule__Mimic__MimicsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MimicsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMimicsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalDsl.g:5271:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5275:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalDsl.g:5276:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__SafetyController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0"


    // $ANTLR start "rule__SafetyController__Group__0__Impl"
    // InternalDsl.g:5283:1: rule__SafetyController__Group__0__Impl : ( ( rule__SafetyController__NameAssignment_0 ) ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5287:1: ( ( ( rule__SafetyController__NameAssignment_0 ) ) )
            // InternalDsl.g:5288:1: ( ( rule__SafetyController__NameAssignment_0 ) )
            {
            // InternalDsl.g:5288:1: ( ( rule__SafetyController__NameAssignment_0 ) )
            // InternalDsl.g:5289:2: ( rule__SafetyController__NameAssignment_0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 
            // InternalDsl.g:5290:2: ( rule__SafetyController__NameAssignment_0 )
            // InternalDsl.g:5290:3: rule__SafetyController__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalDsl.g:5298:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5302:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalDsl.g:5303:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__SafetyController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1"


    // $ANTLR start "rule__SafetyController__Group__1__Impl"
    // InternalDsl.g:5310:1: rule__SafetyController__Group__1__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5314:1: ( ( 'SafetyController' ) )
            // InternalDsl.g:5315:1: ( 'SafetyController' )
            {
            // InternalDsl.g:5315:1: ( 'SafetyController' )
            // InternalDsl.g:5316:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__2"
    // InternalDsl.g:5325:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5329:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalDsl.g:5330:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__SafetyController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2"


    // $ANTLR start "rule__SafetyController__Group__2__Impl"
    // InternalDsl.g:5337:1: rule__SafetyController__Group__2__Impl : ( ( rule__SafetyController__Group_2__0 )? ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5341:1: ( ( ( rule__SafetyController__Group_2__0 )? ) )
            // InternalDsl.g:5342:1: ( ( rule__SafetyController__Group_2__0 )? )
            {
            // InternalDsl.g:5342:1: ( ( rule__SafetyController__Group_2__0 )? )
            // InternalDsl.g:5343:2: ( rule__SafetyController__Group_2__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_2()); 
            // InternalDsl.g:5344:2: ( rule__SafetyController__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:5344:3: rule__SafetyController__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2__Impl"


    // $ANTLR start "rule__SafetyController__Group__3"
    // InternalDsl.g:5352:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5356:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalDsl.g:5357:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__SafetyController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3"


    // $ANTLR start "rule__SafetyController__Group__3__Impl"
    // InternalDsl.g:5364:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__Group_3__0 )? ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5368:1: ( ( ( rule__SafetyController__Group_3__0 )? ) )
            // InternalDsl.g:5369:1: ( ( rule__SafetyController__Group_3__0 )? )
            {
            // InternalDsl.g:5369:1: ( ( rule__SafetyController__Group_3__0 )? )
            // InternalDsl.g:5370:2: ( rule__SafetyController__Group_3__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_3()); 
            // InternalDsl.g:5371:2: ( rule__SafetyController__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==68) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:5371:3: rule__SafetyController__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3__Impl"


    // $ANTLR start "rule__SafetyController__Group__4"
    // InternalDsl.g:5379:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5383:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalDsl.g:5384:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__SafetyController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4"


    // $ANTLR start "rule__SafetyController__Group__4__Impl"
    // InternalDsl.g:5391:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5395:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalDsl.g:5396:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalDsl.g:5396:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalDsl.g:5397:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalDsl.g:5398:2: ( rule__SafetyController__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:5398:3: rule__SafetyController__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4__Impl"


    // $ANTLR start "rule__SafetyController__Group__5"
    // InternalDsl.g:5406:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5410:1: ( rule__SafetyController__Group__5__Impl )
            // InternalDsl.g:5411:2: rule__SafetyController__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5"


    // $ANTLR start "rule__SafetyController__Group__5__Impl"
    // InternalDsl.g:5417:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__Group_5__0 )? ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5421:1: ( ( ( rule__SafetyController__Group_5__0 )? ) )
            // InternalDsl.g:5422:1: ( ( rule__SafetyController__Group_5__0 )? )
            {
            // InternalDsl.g:5422:1: ( ( rule__SafetyController__Group_5__0 )? )
            // InternalDsl.g:5423:2: ( rule__SafetyController__Group_5__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_5()); 
            // InternalDsl.g:5424:2: ( rule__SafetyController__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==70) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:5424:3: rule__SafetyController__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__0"
    // InternalDsl.g:5433:1: rule__SafetyController__Group_2__0 : rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 ;
    public final void rule__SafetyController__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5437:1: ( rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 )
            // InternalDsl.g:5438:2: rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__SafetyController__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0"


    // $ANTLR start "rule__SafetyController__Group_2__0__Impl"
    // InternalDsl.g:5445:1: rule__SafetyController__Group_2__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5449:1: ( ( 'softLowerLimit' ) )
            // InternalDsl.g:5450:1: ( 'softLowerLimit' )
            {
            // InternalDsl.g:5450:1: ( 'softLowerLimit' )
            // InternalDsl.g:5451:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__1"
    // InternalDsl.g:5460:1: rule__SafetyController__Group_2__1 : rule__SafetyController__Group_2__1__Impl ;
    public final void rule__SafetyController__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5464:1: ( rule__SafetyController__Group_2__1__Impl )
            // InternalDsl.g:5465:2: rule__SafetyController__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1"


    // $ANTLR start "rule__SafetyController__Group_2__1__Impl"
    // InternalDsl.g:5471:1: rule__SafetyController__Group_2__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) ) ;
    public final void rule__SafetyController__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5475:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) ) )
            // InternalDsl.g:5476:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) )
            {
            // InternalDsl.g:5476:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_2_1 ) )
            // InternalDsl.g:5477:2: ( rule__SafetyController__SoftLowerLimitAssignment_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_2_1()); 
            // InternalDsl.g:5478:2: ( rule__SafetyController__SoftLowerLimitAssignment_2_1 )
            // InternalDsl.g:5478:3: rule__SafetyController__SoftLowerLimitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__0"
    // InternalDsl.g:5487:1: rule__SafetyController__Group_3__0 : rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 ;
    public final void rule__SafetyController__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5491:1: ( rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 )
            // InternalDsl.g:5492:2: rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__SafetyController__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0"


    // $ANTLR start "rule__SafetyController__Group_3__0__Impl"
    // InternalDsl.g:5499:1: rule__SafetyController__Group_3__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5503:1: ( ( 'softUpperLimit' ) )
            // InternalDsl.g:5504:1: ( 'softUpperLimit' )
            {
            // InternalDsl.g:5504:1: ( 'softUpperLimit' )
            // InternalDsl.g:5505:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__1"
    // InternalDsl.g:5514:1: rule__SafetyController__Group_3__1 : rule__SafetyController__Group_3__1__Impl ;
    public final void rule__SafetyController__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5518:1: ( rule__SafetyController__Group_3__1__Impl )
            // InternalDsl.g:5519:2: rule__SafetyController__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1"


    // $ANTLR start "rule__SafetyController__Group_3__1__Impl"
    // InternalDsl.g:5525:1: rule__SafetyController__Group_3__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) ) ;
    public final void rule__SafetyController__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5529:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) ) )
            // InternalDsl.g:5530:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) )
            {
            // InternalDsl.g:5530:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_3_1 ) )
            // InternalDsl.g:5531:2: ( rule__SafetyController__SoftUpperLimitAssignment_3_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_3_1()); 
            // InternalDsl.g:5532:2: ( rule__SafetyController__SoftUpperLimitAssignment_3_1 )
            // InternalDsl.g:5532:3: rule__SafetyController__SoftUpperLimitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__0"
    // InternalDsl.g:5541:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5545:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalDsl.g:5546:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__SafetyController__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0"


    // $ANTLR start "rule__SafetyController__Group_4__0__Impl"
    // InternalDsl.g:5553:1: rule__SafetyController__Group_4__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5557:1: ( ( 'k_position' ) )
            // InternalDsl.g:5558:1: ( 'k_position' )
            {
            // InternalDsl.g:5558:1: ( 'k_position' )
            // InternalDsl.g:5559:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__1"
    // InternalDsl.g:5568:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5572:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalDsl.g:5573:2: rule__SafetyController__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1"


    // $ANTLR start "rule__SafetyController__Group_4__1__Impl"
    // InternalDsl.g:5579:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5583:1: ( ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) )
            // InternalDsl.g:5584:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            {
            // InternalDsl.g:5584:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            // InternalDsl.g:5585:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 
            // InternalDsl.g:5586:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            // InternalDsl.g:5586:3: rule__SafetyController__K_positionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__0"
    // InternalDsl.g:5595:1: rule__SafetyController__Group_5__0 : rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 ;
    public final void rule__SafetyController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5599:1: ( rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 )
            // InternalDsl.g:5600:2: rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__SafetyController__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0"


    // $ANTLR start "rule__SafetyController__Group_5__0__Impl"
    // InternalDsl.g:5607:1: rule__SafetyController__Group_5__0__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5611:1: ( ( 'k_velocity' ) )
            // InternalDsl.g:5612:1: ( 'k_velocity' )
            {
            // InternalDsl.g:5612:1: ( 'k_velocity' )
            // InternalDsl.g:5613:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__1"
    // InternalDsl.g:5622:1: rule__SafetyController__Group_5__1 : rule__SafetyController__Group_5__1__Impl ;
    public final void rule__SafetyController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5626:1: ( rule__SafetyController__Group_5__1__Impl )
            // InternalDsl.g:5627:2: rule__SafetyController__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1"


    // $ANTLR start "rule__SafetyController__Group_5__1__Impl"
    // InternalDsl.g:5633:1: rule__SafetyController__Group_5__1__Impl : ( ( rule__SafetyController__K_velocityAssignment_5_1 ) ) ;
    public final void rule__SafetyController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5637:1: ( ( ( rule__SafetyController__K_velocityAssignment_5_1 ) ) )
            // InternalDsl.g:5638:1: ( ( rule__SafetyController__K_velocityAssignment_5_1 ) )
            {
            // InternalDsl.g:5638:1: ( ( rule__SafetyController__K_velocityAssignment_5_1 ) )
            // InternalDsl.g:5639:2: ( rule__SafetyController__K_velocityAssignment_5_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5_1()); 
            // InternalDsl.g:5640:2: ( rule__SafetyController__K_velocityAssignment_5_1 )
            // InternalDsl.g:5640:3: rule__SafetyController__K_velocityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalDsl.g:5649:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5653:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalDsl.g:5654:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalDsl.g:5661:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5665:1: ( ( RULE_INT ) )
            // InternalDsl.g:5666:1: ( RULE_INT )
            {
            // InternalDsl.g:5666:1: ( RULE_INT )
            // InternalDsl.g:5667:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalDsl.g:5676:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5680:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalDsl.g:5681:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalDsl.g:5688:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5692:1: ( ( '.' ) )
            // InternalDsl.g:5693:1: ( '.' )
            {
            // InternalDsl.g:5693:1: ( '.' )
            // InternalDsl.g:5694:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalDsl.g:5703:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5707:1: ( rule__FLOAT__Group__2__Impl )
            // InternalDsl.g:5708:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalDsl.g:5714:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5718:1: ( ( RULE_INT ) )
            // InternalDsl.g:5719:1: ( RULE_INT )
            {
            // InternalDsl.g:5719:1: ( RULE_INT )
            // InternalDsl.g:5720:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalDsl.g:5730:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5734:1: ( ( RULE_ID ) )
            // InternalDsl.g:5735:2: ( RULE_ID )
            {
            // InternalDsl.g:5735:2: ( RULE_ID )
            // InternalDsl.g:5736:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__LinkAssignment_2"
    // InternalDsl.g:5745:1: rule__Robot__LinkAssignment_2 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5749:1: ( ( ruleLink ) )
            // InternalDsl.g:5750:2: ( ruleLink )
            {
            // InternalDsl.g:5750:2: ( ruleLink )
            // InternalDsl.g:5751:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_2"


    // $ANTLR start "rule__Robot__JointAssignment_3"
    // InternalDsl.g:5760:1: rule__Robot__JointAssignment_3 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5764:1: ( ( ruleJoint ) )
            // InternalDsl.g:5765:2: ( ruleJoint )
            {
            // InternalDsl.g:5765:2: ( ruleJoint )
            // InternalDsl.g:5766:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_3"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalDsl.g:5775:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5779:1: ( ( RULE_ID ) )
            // InternalDsl.g:5780:2: ( RULE_ID )
            {
            // InternalDsl.g:5780:2: ( RULE_ID )
            // InternalDsl.g:5781:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Link__InertialAssignment_3"
    // InternalDsl.g:5790:1: rule__Link__InertialAssignment_3 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5794:1: ( ( ruleInertial ) )
            // InternalDsl.g:5795:2: ( ruleInertial )
            {
            // InternalDsl.g:5795:2: ( ruleInertial )
            // InternalDsl.g:5796:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3"


    // $ANTLR start "rule__Link__VisualsAssignment_4"
    // InternalDsl.g:5805:1: rule__Link__VisualsAssignment_4 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5809:1: ( ( ruleVisual ) )
            // InternalDsl.g:5810:2: ( ruleVisual )
            {
            // InternalDsl.g:5810:2: ( ruleVisual )
            // InternalDsl.g:5811:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_4"


    // $ANTLR start "rule__Link__CollisionAssignment_5"
    // InternalDsl.g:5820:1: rule__Link__CollisionAssignment_5 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5824:1: ( ( ruleCollision ) )
            // InternalDsl.g:5825:2: ( ruleCollision )
            {
            // InternalDsl.g:5825:2: ( ruleCollision )
            // InternalDsl.g:5826:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_5"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalDsl.g:5835:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5839:1: ( ( RULE_ID ) )
            // InternalDsl.g:5840:2: ( RULE_ID )
            {
            // InternalDsl.g:5840:2: ( RULE_ID )
            // InternalDsl.g:5841:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_2"
    // InternalDsl.g:5850:1: rule__Joint__TypeAssignment_2 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5854:1: ( ( ruleJointType ) )
            // InternalDsl.g:5855:2: ( ruleJointType )
            {
            // InternalDsl.g:5855:2: ( ruleJointType )
            // InternalDsl.g:5856:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_2"


    // $ANTLR start "rule__Joint__ChildOfAssignment_3"
    // InternalDsl.g:5865:1: rule__Joint__ChildOfAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ChildOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5869:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:5870:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:5870:2: ( ( RULE_STRING ) )
            // InternalDsl.g:5871:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 
            // InternalDsl.g:5872:3: ( RULE_STRING )
            // InternalDsl.g:5873:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_3"


    // $ANTLR start "rule__Joint__ParentOfAssignment_4"
    // InternalDsl.g:5884:1: rule__Joint__ParentOfAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ParentOfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5888:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:5889:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:5889:2: ( ( RULE_STRING ) )
            // InternalDsl.g:5890:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0()); 
            // InternalDsl.g:5891:3: ( RULE_STRING )
            // InternalDsl.g:5892:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_4"


    // $ANTLR start "rule__Joint__LimitAssignment_5"
    // InternalDsl.g:5903:1: rule__Joint__LimitAssignment_5 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5907:1: ( ( ruleLimit ) )
            // InternalDsl.g:5908:2: ( ruleLimit )
            {
            // InternalDsl.g:5908:2: ( ruleLimit )
            // InternalDsl.g:5909:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_5"


    // $ANTLR start "rule__Joint__AxisAssignment_6"
    // InternalDsl.g:5918:1: rule__Joint__AxisAssignment_6 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5922:1: ( ( ruleAxis ) )
            // InternalDsl.g:5923:2: ( ruleAxis )
            {
            // InternalDsl.g:5923:2: ( ruleAxis )
            // InternalDsl.g:5924:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_6"


    // $ANTLR start "rule__Joint__OriginAssignment_7"
    // InternalDsl.g:5933:1: rule__Joint__OriginAssignment_7 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5937:1: ( ( ruleOrigin ) )
            // InternalDsl.g:5938:2: ( ruleOrigin )
            {
            // InternalDsl.g:5938:2: ( ruleOrigin )
            // InternalDsl.g:5939:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_7"


    // $ANTLR start "rule__Joint__CalibrationAssignment_8"
    // InternalDsl.g:5948:1: rule__Joint__CalibrationAssignment_8 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5952:1: ( ( ruleCalibration ) )
            // InternalDsl.g:5953:2: ( ruleCalibration )
            {
            // InternalDsl.g:5953:2: ( ruleCalibration )
            // InternalDsl.g:5954:3: ruleCalibration
            {
             before(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__CalibrationAssignment_8"


    // $ANTLR start "rule__Joint__DynamicsAssignment_9"
    // InternalDsl.g:5963:1: rule__Joint__DynamicsAssignment_9 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5967:1: ( ( ruleDynamics ) )
            // InternalDsl.g:5968:2: ( ruleDynamics )
            {
            // InternalDsl.g:5968:2: ( ruleDynamics )
            // InternalDsl.g:5969:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DynamicsAssignment_9"


    // $ANTLR start "rule__Joint__MimicAssignment_10"
    // InternalDsl.g:5978:1: rule__Joint__MimicAssignment_10 : ( ruleMimic ) ;
    public final void rule__Joint__MimicAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5982:1: ( ( ruleMimic ) )
            // InternalDsl.g:5983:2: ( ruleMimic )
            {
            // InternalDsl.g:5983:2: ( ruleMimic )
            // InternalDsl.g:5984:3: ruleMimic
            {
             before(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__MimicAssignment_10"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_11"
    // InternalDsl.g:5993:1: rule__Joint__SafetycontrollerAssignment_11 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5997:1: ( ( ruleSafetyController ) )
            // InternalDsl.g:5998:2: ( ruleSafetyController )
            {
            // InternalDsl.g:5998:2: ( ruleSafetyController )
            // InternalDsl.g:5999:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_11"


    // $ANTLR start "rule__Inertial__NameAssignment_0"
    // InternalDsl.g:6008:1: rule__Inertial__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6012:1: ( ( RULE_ID ) )
            // InternalDsl.g:6013:2: ( RULE_ID )
            {
            // InternalDsl.g:6013:2: ( RULE_ID )
            // InternalDsl.g:6014:3: RULE_ID
            {
             before(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__NameAssignment_0"


    // $ANTLR start "rule__Inertial__OriginAssignment_1"
    // InternalDsl.g:6023:1: rule__Inertial__OriginAssignment_1 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6027:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6028:2: ( ruleOrigin )
            {
            // InternalDsl.g:6028:2: ( ruleOrigin )
            // InternalDsl.g:6029:3: ruleOrigin
            {
             before(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_1"


    // $ANTLR start "rule__Inertial__MassAssignment_2"
    // InternalDsl.g:6038:1: rule__Inertial__MassAssignment_2 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6042:1: ( ( ruleMass ) )
            // InternalDsl.g:6043:2: ( ruleMass )
            {
            // InternalDsl.g:6043:2: ( ruleMass )
            // InternalDsl.g:6044:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_2"


    // $ANTLR start "rule__Inertial__InertiaAssignment_3"
    // InternalDsl.g:6053:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6057:1: ( ( ruleInertia ) )
            // InternalDsl.g:6058:2: ( ruleInertia )
            {
            // InternalDsl.g:6058:2: ( ruleInertia )
            // InternalDsl.g:6059:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_3"


    // $ANTLR start "rule__Visual__NameAssignment_0"
    // InternalDsl.g:6068:1: rule__Visual__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6072:1: ( ( RULE_ID ) )
            // InternalDsl.g:6073:2: ( RULE_ID )
            {
            // InternalDsl.g:6073:2: ( RULE_ID )
            // InternalDsl.g:6074:3: RULE_ID
            {
             before(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__NameAssignment_0"


    // $ANTLR start "rule__Visual__MaterialAssignment_1"
    // InternalDsl.g:6083:1: rule__Visual__MaterialAssignment_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6087:1: ( ( ruleMaterial ) )
            // InternalDsl.g:6088:2: ( ruleMaterial )
            {
            // InternalDsl.g:6088:2: ( ruleMaterial )
            // InternalDsl.g:6089:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__MaterialAssignment_1"


    // $ANTLR start "rule__Visual__OriginAssignment_2"
    // InternalDsl.g:6098:1: rule__Visual__OriginAssignment_2 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6102:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6103:2: ( ruleOrigin )
            {
            // InternalDsl.g:6103:2: ( ruleOrigin )
            // InternalDsl.g:6104:3: ruleOrigin
            {
             before(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_2"


    // $ANTLR start "rule__Visual__GeometryAssignment_3"
    // InternalDsl.g:6113:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6117:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6118:2: ( ruleGeometry )
            {
            // InternalDsl.g:6118:2: ( ruleGeometry )
            // InternalDsl.g:6119:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_3"


    // $ANTLR start "rule__Collision__NameAssignment_0"
    // InternalDsl.g:6128:1: rule__Collision__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6132:1: ( ( RULE_ID ) )
            // InternalDsl.g:6133:2: ( RULE_ID )
            {
            // InternalDsl.g:6133:2: ( RULE_ID )
            // InternalDsl.g:6134:3: RULE_ID
            {
             before(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__NameAssignment_0"


    // $ANTLR start "rule__Collision__GeometryAssignment_1"
    // InternalDsl.g:6143:1: rule__Collision__GeometryAssignment_1 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6147:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6148:2: ( ruleGeometry )
            {
            // InternalDsl.g:6148:2: ( ruleGeometry )
            // InternalDsl.g:6149:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_1"


    // $ANTLR start "rule__Collision__OriginAssignment_2"
    // InternalDsl.g:6158:1: rule__Collision__OriginAssignment_2 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6162:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6163:2: ( ruleOrigin )
            {
            // InternalDsl.g:6163:2: ( ruleOrigin )
            // InternalDsl.g:6164:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_2"


    // $ANTLR start "rule__Origin__NameAssignment_1"
    // InternalDsl.g:6173:1: rule__Origin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6177:1: ( ( RULE_ID ) )
            // InternalDsl.g:6178:2: ( RULE_ID )
            {
            // InternalDsl.g:6178:2: ( RULE_ID )
            // InternalDsl.g:6179:3: RULE_ID
            {
             before(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__NameAssignment_1"


    // $ANTLR start "rule__Origin__XAssignment_2_1"
    // InternalDsl.g:6188:1: rule__Origin__XAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6192:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6193:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6193:2: ( ruleFLOAT )
            // InternalDsl.g:6194:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__XAssignment_2_1"


    // $ANTLR start "rule__Origin__YAssignment_3_1"
    // InternalDsl.g:6203:1: rule__Origin__YAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6207:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6208:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6208:2: ( ruleFLOAT )
            // InternalDsl.g:6209:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YAssignment_3_1"


    // $ANTLR start "rule__Origin__ZAssignment_4_1"
    // InternalDsl.g:6218:1: rule__Origin__ZAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6222:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6223:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6223:2: ( ruleFLOAT )
            // InternalDsl.g:6224:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__ZAssignment_4_1"


    // $ANTLR start "rule__Origin__RollAssignment_5_1"
    // InternalDsl.g:6233:1: rule__Origin__RollAssignment_5_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__RollAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6237:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6238:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6238:2: ( ruleFLOAT )
            // InternalDsl.g:6239:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__RollAssignment_5_1"


    // $ANTLR start "rule__Origin__PitchAssignment_6_1"
    // InternalDsl.g:6248:1: rule__Origin__PitchAssignment_6_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__PitchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6252:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6253:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6253:2: ( ruleFLOAT )
            // InternalDsl.g:6254:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__PitchAssignment_6_1"


    // $ANTLR start "rule__Origin__YawAssignment_7_1"
    // InternalDsl.g:6263:1: rule__Origin__YawAssignment_7_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__YawAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6267:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6268:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6268:2: ( ruleFLOAT )
            // InternalDsl.g:6269:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YawAssignment_7_1"


    // $ANTLR start "rule__Mass__NameAssignment_0"
    // InternalDsl.g:6278:1: rule__Mass__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6282:1: ( ( RULE_ID ) )
            // InternalDsl.g:6283:2: ( RULE_ID )
            {
            // InternalDsl.g:6283:2: ( RULE_ID )
            // InternalDsl.g:6284:3: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__NameAssignment_0"


    // $ANTLR start "rule__Mass__MassValueInKilogramsAssignment_3"
    // InternalDsl.g:6293:1: rule__Mass__MassValueInKilogramsAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Mass__MassValueInKilogramsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6297:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6298:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6298:2: ( ruleFLOAT )
            // InternalDsl.g:6299:3: ruleFLOAT
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__MassValueInKilogramsAssignment_3"


    // $ANTLR start "rule__Inertia__NameAssignment_0"
    // InternalDsl.g:6308:1: rule__Inertia__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6312:1: ( ( RULE_ID ) )
            // InternalDsl.g:6313:2: ( RULE_ID )
            {
            // InternalDsl.g:6313:2: ( RULE_ID )
            // InternalDsl.g:6314:3: RULE_ID
            {
             before(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__NameAssignment_0"


    // $ANTLR start "rule__Inertia__IxxAssignment_3"
    // InternalDsl.g:6323:1: rule__Inertia__IxxAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6327:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6328:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6328:2: ( ruleFLOAT )
            // InternalDsl.g:6329:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxxAssignment_3"


    // $ANTLR start "rule__Inertia__IxyAssignment_5"
    // InternalDsl.g:6338:1: rule__Inertia__IxyAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6342:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6343:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6343:2: ( ruleFLOAT )
            // InternalDsl.g:6344:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxyAssignment_5"


    // $ANTLR start "rule__Inertia__IxzAssignment_7"
    // InternalDsl.g:6353:1: rule__Inertia__IxzAssignment_7 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxzAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6357:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6358:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6358:2: ( ruleFLOAT )
            // InternalDsl.g:6359:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxzAssignment_7"


    // $ANTLR start "rule__Inertia__IyyAssignment_9"
    // InternalDsl.g:6368:1: rule__Inertia__IyyAssignment_9 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IyyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6372:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6373:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6373:2: ( ruleFLOAT )
            // InternalDsl.g:6374:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyyAssignment_9"


    // $ANTLR start "rule__Inertia__IyzAssignment_11"
    // InternalDsl.g:6383:1: rule__Inertia__IyzAssignment_11 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IyzAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6387:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6388:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6388:2: ( ruleFLOAT )
            // InternalDsl.g:6389:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyzAssignment_11"


    // $ANTLR start "rule__Inertia__IzzAssignment_13"
    // InternalDsl.g:6398:1: rule__Inertia__IzzAssignment_13 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IzzAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6402:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6403:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6403:2: ( ruleFLOAT )
            // InternalDsl.g:6404:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IzzAssignment_13"


    // $ANTLR start "rule__Color__NameAssignment_0"
    // InternalDsl.g:6413:1: rule__Color__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6417:1: ( ( RULE_ID ) )
            // InternalDsl.g:6418:2: ( RULE_ID )
            {
            // InternalDsl.g:6418:2: ( RULE_ID )
            // InternalDsl.g:6419:3: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_0"


    // $ANTLR start "rule__Color__RedAssignment_2_1"
    // InternalDsl.g:6428:1: rule__Color__RedAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Color__RedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6432:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6433:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6433:2: ( ruleFLOAT )
            // InternalDsl.g:6434:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_2_1"


    // $ANTLR start "rule__Color__GreenAssignment_3_1"
    // InternalDsl.g:6443:1: rule__Color__GreenAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Color__GreenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6447:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6448:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6448:2: ( ruleFLOAT )
            // InternalDsl.g:6449:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_3_1"


    // $ANTLR start "rule__Color__BlueAssignment_4_1"
    // InternalDsl.g:6458:1: rule__Color__BlueAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__Color__BlueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6462:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6463:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6463:2: ( ruleFLOAT )
            // InternalDsl.g:6464:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_4_1"


    // $ANTLR start "rule__Color__AlphaAssignment_5_1"
    // InternalDsl.g:6473:1: rule__Color__AlphaAssignment_5_1 : ( ruleFLOAT ) ;
    public final void rule__Color__AlphaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6477:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6478:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6478:2: ( ruleFLOAT )
            // InternalDsl.g:6479:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__AlphaAssignment_5_1"


    // $ANTLR start "rule__Texture__NameAssignment_0"
    // InternalDsl.g:6488:1: rule__Texture__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6492:1: ( ( RULE_ID ) )
            // InternalDsl.g:6493:2: ( RULE_ID )
            {
            // InternalDsl.g:6493:2: ( RULE_ID )
            // InternalDsl.g:6494:3: RULE_ID
            {
             before(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__NameAssignment_0"


    // $ANTLR start "rule__Texture__PathToFileAssignment_2_1"
    // InternalDsl.g:6503:1: rule__Texture__PathToFileAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Texture__PathToFileAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6507:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6508:2: ( RULE_STRING )
            {
            // InternalDsl.g:6508:2: ( RULE_STRING )
            // InternalDsl.g:6509:3: RULE_STRING
            {
             before(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__PathToFileAssignment_2_1"


    // $ANTLR start "rule__Box__NameAssignment_0"
    // InternalDsl.g:6518:1: rule__Box__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6522:1: ( ( RULE_ID ) )
            // InternalDsl.g:6523:2: ( RULE_ID )
            {
            // InternalDsl.g:6523:2: ( RULE_ID )
            // InternalDsl.g:6524:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_0"


    // $ANTLR start "rule__Box__HeightAssignment_2_1"
    // InternalDsl.g:6533:1: rule__Box__HeightAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Box__HeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6537:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6538:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6538:2: ( ruleFLOAT )
            // InternalDsl.g:6539:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__HeightAssignment_2_1"


    // $ANTLR start "rule__Box__LengthAssignment_3_1"
    // InternalDsl.g:6548:1: rule__Box__LengthAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Box__LengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6552:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6553:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6553:2: ( ruleFLOAT )
            // InternalDsl.g:6554:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__LengthAssignment_3_1"


    // $ANTLR start "rule__Box__WidthAssignment_4_1"
    // InternalDsl.g:6563:1: rule__Box__WidthAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__Box__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6567:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6568:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6568:2: ( ruleFLOAT )
            // InternalDsl.g:6569:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__WidthAssignment_4_1"


    // $ANTLR start "rule__Cylinder__NameAssignment_0"
    // InternalDsl.g:6578:1: rule__Cylinder__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6582:1: ( ( RULE_ID ) )
            // InternalDsl.g:6583:2: ( RULE_ID )
            {
            // InternalDsl.g:6583:2: ( RULE_ID )
            // InternalDsl.g:6584:3: RULE_ID
            {
             before(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__NameAssignment_0"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_2_1"
    // InternalDsl.g:6593:1: rule__Cylinder__RadiusAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Cylinder__RadiusAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6597:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6598:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6598:2: ( ruleFLOAT )
            // InternalDsl.g:6599:3: ruleFLOAT
            {
             before(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_2_1"


    // $ANTLR start "rule__Cylinder__LengthAssignment_3_1"
    // InternalDsl.g:6608:1: rule__Cylinder__LengthAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Cylinder__LengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6612:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6613:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6613:2: ( ruleFLOAT )
            // InternalDsl.g:6614:3: ruleFLOAT
            {
             before(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_3_1"


    // $ANTLR start "rule__Mesh__NameAssignment_0"
    // InternalDsl.g:6623:1: rule__Mesh__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6627:1: ( ( RULE_ID ) )
            // InternalDsl.g:6628:2: ( RULE_ID )
            {
            // InternalDsl.g:6628:2: ( RULE_ID )
            // InternalDsl.g:6629:3: RULE_ID
            {
             before(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__NameAssignment_0"


    // $ANTLR start "rule__Mesh__PathToFileAssignment_2_1"
    // InternalDsl.g:6638:1: rule__Mesh__PathToFileAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Mesh__PathToFileAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6642:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6643:2: ( RULE_STRING )
            {
            // InternalDsl.g:6643:2: ( RULE_STRING )
            // InternalDsl.g:6644:3: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__PathToFileAssignment_2_1"


    // $ANTLR start "rule__Mesh__BoxAssignment_3_1"
    // InternalDsl.g:6653:1: rule__Mesh__BoxAssignment_3_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Mesh__BoxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6657:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:6658:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:6658:2: ( ( RULE_STRING ) )
            // InternalDsl.g:6659:3: ( RULE_STRING )
            {
             before(grammarAccess.getMeshAccess().getBoxBoxCrossReference_3_1_0()); 
            // InternalDsl.g:6660:3: ( RULE_STRING )
            // InternalDsl.g:6661:4: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMeshAccess().getBoxBoxCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__BoxAssignment_3_1"


    // $ANTLR start "rule__Sphere__NameAssignment_0"
    // InternalDsl.g:6672:1: rule__Sphere__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6676:1: ( ( RULE_ID ) )
            // InternalDsl.g:6677:2: ( RULE_ID )
            {
            // InternalDsl.g:6677:2: ( RULE_ID )
            // InternalDsl.g:6678:3: RULE_ID
            {
             before(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__NameAssignment_0"


    // $ANTLR start "rule__Sphere__RadiusAssignment_2_1"
    // InternalDsl.g:6687:1: rule__Sphere__RadiusAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Sphere__RadiusAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6691:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6692:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6692:2: ( ruleFLOAT )
            // InternalDsl.g:6693:3: ruleFLOAT
            {
             before(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_2_1"


    // $ANTLR start "rule__Limit__NameAssignment_0"
    // InternalDsl.g:6702:1: rule__Limit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6706:1: ( ( RULE_ID ) )
            // InternalDsl.g:6707:2: ( RULE_ID )
            {
            // InternalDsl.g:6707:2: ( RULE_ID )
            // InternalDsl.g:6708:3: RULE_ID
            {
             before(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__NameAssignment_0"


    // $ANTLR start "rule__Limit__LowerAssignment_3"
    // InternalDsl.g:6717:1: rule__Limit__LowerAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Limit__LowerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6721:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6722:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6722:2: ( ruleFLOAT )
            // InternalDsl.g:6723:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_3"


    // $ANTLR start "rule__Limit__UpperAssignment_5"
    // InternalDsl.g:6732:1: rule__Limit__UpperAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Limit__UpperAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6736:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6737:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6737:2: ( ruleFLOAT )
            // InternalDsl.g:6738:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_5"


    // $ANTLR start "rule__Limit__EffortAssignment_7"
    // InternalDsl.g:6747:1: rule__Limit__EffortAssignment_7 : ( ruleFLOAT ) ;
    public final void rule__Limit__EffortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6751:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6752:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6752:2: ( ruleFLOAT )
            // InternalDsl.g:6753:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_7"


    // $ANTLR start "rule__Limit__VelocityAssignment_9"
    // InternalDsl.g:6762:1: rule__Limit__VelocityAssignment_9 : ( ruleFLOAT ) ;
    public final void rule__Limit__VelocityAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6766:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6767:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6767:2: ( ruleFLOAT )
            // InternalDsl.g:6768:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_9"


    // $ANTLR start "rule__Axis__NameAssignment_0"
    // InternalDsl.g:6777:1: rule__Axis__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6781:1: ( ( RULE_ID ) )
            // InternalDsl.g:6782:2: ( RULE_ID )
            {
            // InternalDsl.g:6782:2: ( RULE_ID )
            // InternalDsl.g:6783:3: RULE_ID
            {
             before(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__NameAssignment_0"


    // $ANTLR start "rule__Axis__XAssignment_3"
    // InternalDsl.g:6792:1: rule__Axis__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6796:1: ( ( RULE_INT ) )
            // InternalDsl.g:6797:2: ( RULE_INT )
            {
            // InternalDsl.g:6797:2: ( RULE_INT )
            // InternalDsl.g:6798:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_3"


    // $ANTLR start "rule__Axis__YAssignment_5"
    // InternalDsl.g:6807:1: rule__Axis__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6811:1: ( ( RULE_INT ) )
            // InternalDsl.g:6812:2: ( RULE_INT )
            {
            // InternalDsl.g:6812:2: ( RULE_INT )
            // InternalDsl.g:6813:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_5"


    // $ANTLR start "rule__Axis__ZAssignment_7"
    // InternalDsl.g:6822:1: rule__Axis__ZAssignment_7 : ( RULE_INT ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6826:1: ( ( RULE_INT ) )
            // InternalDsl.g:6827:2: ( RULE_INT )
            {
            // InternalDsl.g:6827:2: ( RULE_INT )
            // InternalDsl.g:6828:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_7"


    // $ANTLR start "rule__Calibration__NameAssignment_0"
    // InternalDsl.g:6837:1: rule__Calibration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6841:1: ( ( RULE_ID ) )
            // InternalDsl.g:6842:2: ( RULE_ID )
            {
            // InternalDsl.g:6842:2: ( RULE_ID )
            // InternalDsl.g:6843:3: RULE_ID
            {
             before(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__NameAssignment_0"


    // $ANTLR start "rule__Calibration__RisingAssignment_2_1"
    // InternalDsl.g:6852:1: rule__Calibration__RisingAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__RisingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6856:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6857:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6857:2: ( ruleFLOAT )
            // InternalDsl.g:6858:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__RisingAssignment_2_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_3_1"
    // InternalDsl.g:6867:1: rule__Calibration__FallingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__FallingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6871:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6872:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6872:2: ( ruleFLOAT )
            // InternalDsl.g:6873:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__FallingAssignment_3_1"


    // $ANTLR start "rule__Dynamics__NameAssignment_0"
    // InternalDsl.g:6882:1: rule__Dynamics__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6886:1: ( ( RULE_ID ) )
            // InternalDsl.g:6887:2: ( RULE_ID )
            {
            // InternalDsl.g:6887:2: ( RULE_ID )
            // InternalDsl.g:6888:3: RULE_ID
            {
             before(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__NameAssignment_0"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_2_1"
    // InternalDsl.g:6897:1: rule__Dynamics__FrictionAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__FrictionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6901:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6902:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6902:2: ( ruleFLOAT )
            // InternalDsl.g:6903:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_2_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_3_1"
    // InternalDsl.g:6912:1: rule__Dynamics__DampingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__DampingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6916:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6917:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6917:2: ( ruleFLOAT )
            // InternalDsl.g:6918:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_3_1"


    // $ANTLR start "rule__Mimic__NameAssignment_0"
    // InternalDsl.g:6927:1: rule__Mimic__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mimic__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6931:1: ( ( RULE_ID ) )
            // InternalDsl.g:6932:2: ( RULE_ID )
            {
            // InternalDsl.g:6932:2: ( RULE_ID )
            // InternalDsl.g:6933:3: RULE_ID
            {
             before(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__NameAssignment_0"


    // $ANTLR start "rule__Mimic__MultiplierAssignment_2_1"
    // InternalDsl.g:6942:1: rule__Mimic__MultiplierAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__MultiplierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6946:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6947:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6947:2: ( ruleFLOAT )
            // InternalDsl.g:6948:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MultiplierAssignment_2_1"


    // $ANTLR start "rule__Mimic__OffSetAssignment_3_1"
    // InternalDsl.g:6957:1: rule__Mimic__OffSetAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__OffSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6961:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6962:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6962:2: ( ruleFLOAT )
            // InternalDsl.g:6963:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__OffSetAssignment_3_1"


    // $ANTLR start "rule__Mimic__MimicsAssignment_4_1"
    // InternalDsl.g:6972:1: rule__Mimic__MimicsAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Mimic__MimicsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6976:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:6977:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:6977:2: ( ( RULE_STRING ) )
            // InternalDsl.g:6978:3: ( RULE_STRING )
            {
             before(grammarAccess.getMimicAccess().getMimicsJointCrossReference_4_1_0()); 
            // InternalDsl.g:6979:3: ( RULE_STRING )
            // InternalDsl.g:6980:4: RULE_STRING
            {
             before(grammarAccess.getMimicAccess().getMimicsJointSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsJointSTRINGTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMimicAccess().getMimicsJointCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MimicsAssignment_4_1"


    // $ANTLR start "rule__SafetyController__NameAssignment_0"
    // InternalDsl.g:6991:1: rule__SafetyController__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6995:1: ( ( RULE_ID ) )
            // InternalDsl.g:6996:2: ( RULE_ID )
            {
            // InternalDsl.g:6996:2: ( RULE_ID )
            // InternalDsl.g:6997:3: RULE_ID
            {
             before(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__NameAssignment_0"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_2_1"
    // InternalDsl.g:7006:1: rule__SafetyController__SoftLowerLimitAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7010:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7011:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7011:2: ( ruleFLOAT )
            // InternalDsl.g:7012:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_2_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_3_1"
    // InternalDsl.g:7021:1: rule__SafetyController__SoftUpperLimitAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7025:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7026:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7026:2: ( ruleFLOAT )
            // InternalDsl.g:7027:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_3_1"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_4_1"
    // InternalDsl.g:7036:1: rule__SafetyController__K_positionAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_positionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7040:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7041:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7041:2: ( ruleFLOAT )
            // InternalDsl.g:7042:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_4_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_5_1"
    // InternalDsl.g:7051:1: rule__SafetyController__K_velocityAssignment_5_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_velocityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7055:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7056:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7056:2: ( ruleFLOAT )
            // InternalDsl.g:7057:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_5_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\2\36\uffff";
    static final String dfa_3s = "\2\5\1\uffff\2\5\6\4\1\31\6\107\1\uffff\6\4\6\5";
    static final String dfa_4s = "\1\21\1\22\1\uffff\1\5\1\30\6\4\1\61\6\107\1\uffff\6\4\5\30\1\5";
    static final String dfa_5s = "\2\uffff\1\2\17\uffff\1\1\14\uffff";
    static final String dfa_6s = "\37\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\2\2",
            "\1\2\14\uffff\1\3",
            "",
            "\1\4",
            "\1\13\15\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22\17\uffff\1\2\3\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\13\16\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\13\17\uffff\1\7\1\10\1\11\1\12",
            "\1\13\20\uffff\1\10\1\11\1\12",
            "\1\13\21\uffff\1\11\1\12",
            "\1\13\22\uffff\1\12",
            "\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 970:2: ( rule__Link__InertialAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});

}