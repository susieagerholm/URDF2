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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'", "'RobotName'", "','", "'Link'", "'inertial'", "'visuals'", "'collision'", "'Joint'", "'ChildOf'", "'ParentOf'", "'origin'", "'Type'", "'limit'", "'axis'", "'callibration'", "'dynamics'", "'mimic'", "'safetycontroller'", "'mass'", "'inertia'", "'geometry'", "'material'", "'x'", "'y'", "'z'", "'Roll'", "'Pitch'", "'Yaw'", "'Mass'", "'Inertia'", "'Material'", "'Geometry'", "'Color'", "'Texture'", "'Box'", "'Cylinder'", "'Mesh'", "'Sphere'", "'Lower'", "'Upper'", "'Effort'", "'Velocity'", "'Rising'", "'Falling'", "'Friction'", "'Damping'", "'Multiplier'", "'OffSet'", "'SoftLowerLimit'", "'SoftUpperLimit'", "'k_position'", "'k_velocity'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleMaterial_Impl"
    // InternalDsl.g:328:1: entryRuleMaterial_Impl : ruleMaterial_Impl EOF ;
    public final void entryRuleMaterial_Impl() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleMaterial_Impl EOF )
            // InternalDsl.g:330:1: ruleMaterial_Impl EOF
            {
             before(grammarAccess.getMaterial_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial_Impl();

            state._fsp--;

             after(grammarAccess.getMaterial_ImplRule()); 
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
    // $ANTLR end "entryRuleMaterial_Impl"


    // $ANTLR start "ruleMaterial_Impl"
    // InternalDsl.g:337:1: ruleMaterial_Impl : ( ( rule__Material_Impl__Group__0 ) ) ;
    public final void ruleMaterial_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Material_Impl__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Material_Impl__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Material_Impl__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Material_Impl__Group__0 )
            {
             before(grammarAccess.getMaterial_ImplAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Material_Impl__Group__0 )
            // InternalDsl.g:344:4: rule__Material_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Material_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaterial_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial_Impl"


    // $ANTLR start "entryRuleGeometry_Impl"
    // InternalDsl.g:353:1: entryRuleGeometry_Impl : ruleGeometry_Impl EOF ;
    public final void entryRuleGeometry_Impl() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleGeometry_Impl EOF )
            // InternalDsl.g:355:1: ruleGeometry_Impl EOF
            {
             before(grammarAccess.getGeometry_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry_Impl();

            state._fsp--;

             after(grammarAccess.getGeometry_ImplRule()); 
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
    // $ANTLR end "entryRuleGeometry_Impl"


    // $ANTLR start "ruleGeometry_Impl"
    // InternalDsl.g:362:1: ruleGeometry_Impl : ( ( rule__Geometry_Impl__Group__0 ) ) ;
    public final void ruleGeometry_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Geometry_Impl__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Geometry_Impl__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Geometry_Impl__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Geometry_Impl__Group__0 )
            {
             before(grammarAccess.getGeometry_ImplAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Geometry_Impl__Group__0 )
            // InternalDsl.g:369:4: rule__Geometry_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Geometry_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeometry_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry_Impl"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:378:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleColor EOF )
            // InternalDsl.g:380:1: ruleColor EOF
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
    // InternalDsl.g:387:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Color__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Color__Group__0 )
            // InternalDsl.g:394:4: rule__Color__Group__0
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
    // InternalDsl.g:403:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleTexture EOF )
            // InternalDsl.g:405:1: ruleTexture EOF
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
    // InternalDsl.g:412:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Texture__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Texture__Group__0 )
            // InternalDsl.g:419:4: rule__Texture__Group__0
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
    // InternalDsl.g:428:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleBox EOF )
            // InternalDsl.g:430:1: ruleBox EOF
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
    // InternalDsl.g:437:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Box__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Box__Group__0 )
            // InternalDsl.g:444:4: rule__Box__Group__0
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
    // InternalDsl.g:453:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleCylinder EOF )
            // InternalDsl.g:455:1: ruleCylinder EOF
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
    // InternalDsl.g:462:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Cylinder__Group__0 )
            // InternalDsl.g:469:4: rule__Cylinder__Group__0
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
    // InternalDsl.g:478:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleMesh EOF )
            // InternalDsl.g:480:1: ruleMesh EOF
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
    // InternalDsl.g:487:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Mesh__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Mesh__Group__0 )
            // InternalDsl.g:494:4: rule__Mesh__Group__0
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
    // InternalDsl.g:503:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleSphere EOF )
            // InternalDsl.g:505:1: ruleSphere EOF
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
    // InternalDsl.g:512:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Sphere__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Sphere__Group__0 )
            // InternalDsl.g:519:4: rule__Sphere__Group__0
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
    // InternalDsl.g:528:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleLimit EOF )
            // InternalDsl.g:530:1: ruleLimit EOF
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
    // InternalDsl.g:537:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Limit__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__Limit__Group__0 )
            // InternalDsl.g:544:4: rule__Limit__Group__0
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
    // InternalDsl.g:553:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleAxis EOF )
            // InternalDsl.g:555:1: ruleAxis EOF
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
    // InternalDsl.g:562:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Axis__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Axis__Group__0 )
            // InternalDsl.g:569:4: rule__Axis__Group__0
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


    // $ANTLR start "entryRuleCallibration"
    // InternalDsl.g:578:1: entryRuleCallibration : ruleCallibration EOF ;
    public final void entryRuleCallibration() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleCallibration EOF )
            // InternalDsl.g:580:1: ruleCallibration EOF
            {
             before(grammarAccess.getCallibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCallibration();

            state._fsp--;

             after(grammarAccess.getCallibrationRule()); 
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
    // $ANTLR end "entryRuleCallibration"


    // $ANTLR start "ruleCallibration"
    // InternalDsl.g:587:1: ruleCallibration : ( ( rule__Callibration__Group__0 ) ) ;
    public final void ruleCallibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__Callibration__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__Callibration__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__Callibration__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__Callibration__Group__0 )
            {
             before(grammarAccess.getCallibrationAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__Callibration__Group__0 )
            // InternalDsl.g:594:4: rule__Callibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallibrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:603:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleDynamics EOF )
            // InternalDsl.g:605:1: ruleDynamics EOF
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
    // InternalDsl.g:612:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__Dynamics__Group__0 )
            // InternalDsl.g:619:4: rule__Dynamics__Group__0
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
    // InternalDsl.g:628:1: entryRuleMimic : ruleMimic EOF ;
    public final void entryRuleMimic() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleMimic EOF )
            // InternalDsl.g:630:1: ruleMimic EOF
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
    // InternalDsl.g:637:1: ruleMimic : ( ( rule__Mimic__Group__0 ) ) ;
    public final void ruleMimic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__Mimic__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__Mimic__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__Mimic__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__Mimic__Group__0 )
            {
             before(grammarAccess.getMimicAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__Mimic__Group__0 )
            // InternalDsl.g:644:4: rule__Mimic__Group__0
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
    // InternalDsl.g:653:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleSafetyController EOF )
            // InternalDsl.g:655:1: ruleSafetyController EOF
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
    // InternalDsl.g:662:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__SafetyController__Group__0 )
            // InternalDsl.g:669:4: rule__SafetyController__Group__0
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


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:678:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:682:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalDsl.g:683:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalDsl.g:683:2: ( ( rule__JointType__Alternatives ) )
            // InternalDsl.g:684:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalDsl.g:685:3: ( rule__JointType__Alternatives )
            // InternalDsl.g:685:4: rule__JointType__Alternatives
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
    // InternalDsl.g:693:1: rule__Material__Alternatives : ( ( ruleMaterial_Impl ) | ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:697:1: ( ( ruleMaterial_Impl ) | ( ruleColor ) | ( ruleTexture ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:698:2: ( ruleMaterial_Impl )
                    {
                    // InternalDsl.g:698:2: ( ruleMaterial_Impl )
                    // InternalDsl.g:699:3: ruleMaterial_Impl
                    {
                     before(grammarAccess.getMaterialAccess().getMaterial_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMaterial_Impl();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getMaterial_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:704:2: ( ruleColor )
                    {
                    // InternalDsl.g:704:2: ( ruleColor )
                    // InternalDsl.g:705:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:710:2: ( ruleTexture )
                    {
                    // InternalDsl.g:710:2: ( ruleTexture )
                    // InternalDsl.g:711:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_2()); 

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
    // InternalDsl.g:720:1: rule__Geometry__Alternatives : ( ( ruleGeometry_Impl ) | ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:724:1: ( ( ruleGeometry_Impl ) | ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt2=1;
                }
                break;
            case 48:
                {
                alt2=2;
                }
                break;
            case 49:
                {
                alt2=3;
                }
                break;
            case 50:
                {
                alt2=4;
                }
                break;
            case 51:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:725:2: ( ruleGeometry_Impl )
                    {
                    // InternalDsl.g:725:2: ( ruleGeometry_Impl )
                    // InternalDsl.g:726:3: ruleGeometry_Impl
                    {
                     before(grammarAccess.getGeometryAccess().getGeometry_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeometry_Impl();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getGeometry_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:731:2: ( ruleBox )
                    {
                    // InternalDsl.g:731:2: ( ruleBox )
                    // InternalDsl.g:732:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:737:2: ( ruleCylinder )
                    {
                    // InternalDsl.g:737:2: ( ruleCylinder )
                    // InternalDsl.g:738:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:743:2: ( ruleMesh )
                    {
                    // InternalDsl.g:743:2: ( ruleMesh )
                    // InternalDsl.g:744:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:749:2: ( ruleSphere )
                    {
                    // InternalDsl.g:749:2: ( ruleSphere )
                    // InternalDsl.g:750:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_4()); 

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
    // InternalDsl.g:759:1: rule__JointType__Alternatives : ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:763:1: ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) )
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
                    // InternalDsl.g:764:2: ( ( 'Revolute' ) )
                    {
                    // InternalDsl.g:764:2: ( ( 'Revolute' ) )
                    // InternalDsl.g:765:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:766:3: ( 'Revolute' )
                    // InternalDsl.g:766:4: 'Revolute'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:770:2: ( ( 'Continous' ) )
                    {
                    // InternalDsl.g:770:2: ( ( 'Continous' ) )
                    // InternalDsl.g:771:3: ( 'Continous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:772:3: ( 'Continous' )
                    // InternalDsl.g:772:4: 'Continous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:776:2: ( ( 'Fixed' ) )
                    {
                    // InternalDsl.g:776:2: ( ( 'Fixed' ) )
                    // InternalDsl.g:777:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:778:3: ( 'Fixed' )
                    // InternalDsl.g:778:4: 'Fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:782:2: ( ( 'Prismatic' ) )
                    {
                    // InternalDsl.g:782:2: ( ( 'Prismatic' ) )
                    // InternalDsl.g:783:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:784:3: ( 'Prismatic' )
                    // InternalDsl.g:784:4: 'Prismatic'
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
    // InternalDsl.g:792:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:796:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalDsl.g:797:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalDsl.g:804:1: rule__Robot__Group__0__Impl : ( 'RobotName' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:808:1: ( ( 'RobotName' ) )
            // InternalDsl.g:809:1: ( 'RobotName' )
            {
            // InternalDsl.g:809:1: ( 'RobotName' )
            // InternalDsl.g:810:2: 'RobotName'
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
    // InternalDsl.g:819:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalDsl.g:824:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalDsl.g:831:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:835:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalDsl.g:836:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalDsl.g:836:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalDsl.g:837:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalDsl.g:838:2: ( rule__Robot__NameAssignment_1 )
            // InternalDsl.g:838:3: rule__Robot__NameAssignment_1
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
    // InternalDsl.g:846:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:850:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalDsl.g:851:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
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
    // InternalDsl.g:858:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__LinkAssignment_2 ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:862:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) )
            // InternalDsl.g:863:1: ( ( rule__Robot__LinkAssignment_2 ) )
            {
            // InternalDsl.g:863:1: ( ( rule__Robot__LinkAssignment_2 ) )
            // InternalDsl.g:864:2: ( rule__Robot__LinkAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:865:2: ( rule__Robot__LinkAssignment_2 )
            // InternalDsl.g:865:3: rule__Robot__LinkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }


            }

        }
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
    // InternalDsl.g:873:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:877:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalDsl.g:878:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

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
    // InternalDsl.g:885:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__Group_3__0 )* ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:889:1: ( ( ( rule__Robot__Group_3__0 )* ) )
            // InternalDsl.g:890:1: ( ( rule__Robot__Group_3__0 )* )
            {
            // InternalDsl.g:890:1: ( ( rule__Robot__Group_3__0 )* )
            // InternalDsl.g:891:2: ( rule__Robot__Group_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_3()); 
            // InternalDsl.g:892:2: ( rule__Robot__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:892:3: rule__Robot__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Robot__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__Group__4"
    // InternalDsl.g:900:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:904:1: ( rule__Robot__Group__4__Impl )
            // InternalDsl.g:905:2: rule__Robot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__4__Impl();

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
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalDsl.g:911:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__Group_4__0 )? ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:915:1: ( ( ( rule__Robot__Group_4__0 )? ) )
            // InternalDsl.g:916:1: ( ( rule__Robot__Group_4__0 )? )
            {
            // InternalDsl.g:916:1: ( ( rule__Robot__Group_4__0 )? )
            // InternalDsl.g:917:2: ( rule__Robot__Group_4__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_4()); 
            // InternalDsl.g:918:2: ( rule__Robot__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:918:3: rule__Robot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group_3__0"
    // InternalDsl.g:927:1: rule__Robot__Group_3__0 : rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 ;
    public final void rule__Robot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1 )
            // InternalDsl.g:932:2: rule__Robot__Group_3__0__Impl rule__Robot__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__1();

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
    // $ANTLR end "rule__Robot__Group_3__0"


    // $ANTLR start "rule__Robot__Group_3__0__Impl"
    // InternalDsl.g:939:1: rule__Robot__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:943:1: ( ( ',' ) )
            // InternalDsl.g:944:1: ( ',' )
            {
            // InternalDsl.g:944:1: ( ',' )
            // InternalDsl.g:945:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_3__1"
    // InternalDsl.g:954:1: rule__Robot__Group_3__1 : rule__Robot__Group_3__1__Impl ;
    public final void rule__Robot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:958:1: ( rule__Robot__Group_3__1__Impl )
            // InternalDsl.g:959:2: rule__Robot__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_3__1__Impl();

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
    // $ANTLR end "rule__Robot__Group_3__1"


    // $ANTLR start "rule__Robot__Group_3__1__Impl"
    // InternalDsl.g:965:1: rule__Robot__Group_3__1__Impl : ( ( rule__Robot__LinkAssignment_3_1 ) ) ;
    public final void rule__Robot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:969:1: ( ( ( rule__Robot__LinkAssignment_3_1 ) ) )
            // InternalDsl.g:970:1: ( ( rule__Robot__LinkAssignment_3_1 ) )
            {
            // InternalDsl.g:970:1: ( ( rule__Robot__LinkAssignment_3_1 ) )
            // InternalDsl.g:971:2: ( rule__Robot__LinkAssignment_3_1 )
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_3_1()); 
            // InternalDsl.g:972:2: ( rule__Robot__LinkAssignment_3_1 )
            // InternalDsl.g:972:3: rule__Robot__LinkAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__LinkAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getLinkAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_3__1__Impl"


    // $ANTLR start "rule__Robot__Group_4__0"
    // InternalDsl.g:981:1: rule__Robot__Group_4__0 : rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 ;
    public final void rule__Robot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:985:1: ( rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 )
            // InternalDsl.g:986:2: rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Robot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__1();

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
    // $ANTLR end "rule__Robot__Group_4__0"


    // $ANTLR start "rule__Robot__Group_4__0__Impl"
    // InternalDsl.g:993:1: rule__Robot__Group_4__0__Impl : ( ( rule__Robot__JointAssignment_4_0 ) ) ;
    public final void rule__Robot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:997:1: ( ( ( rule__Robot__JointAssignment_4_0 ) ) )
            // InternalDsl.g:998:1: ( ( rule__Robot__JointAssignment_4_0 ) )
            {
            // InternalDsl.g:998:1: ( ( rule__Robot__JointAssignment_4_0 ) )
            // InternalDsl.g:999:2: ( rule__Robot__JointAssignment_4_0 )
            {
             before(grammarAccess.getRobotAccess().getJointAssignment_4_0()); 
            // InternalDsl.g:1000:2: ( rule__Robot__JointAssignment_4_0 )
            // InternalDsl.g:1000:3: rule__Robot__JointAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__JointAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getJointAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__0__Impl"


    // $ANTLR start "rule__Robot__Group_4__1"
    // InternalDsl.g:1008:1: rule__Robot__Group_4__1 : rule__Robot__Group_4__1__Impl ;
    public final void rule__Robot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1012:1: ( rule__Robot__Group_4__1__Impl )
            // InternalDsl.g:1013:2: rule__Robot__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__1__Impl();

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
    // $ANTLR end "rule__Robot__Group_4__1"


    // $ANTLR start "rule__Robot__Group_4__1__Impl"
    // InternalDsl.g:1019:1: rule__Robot__Group_4__1__Impl : ( ( rule__Robot__JointAssignment_4_1 )* ) ;
    public final void rule__Robot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( ( ( rule__Robot__JointAssignment_4_1 )* ) )
            // InternalDsl.g:1024:1: ( ( rule__Robot__JointAssignment_4_1 )* )
            {
            // InternalDsl.g:1024:1: ( ( rule__Robot__JointAssignment_4_1 )* )
            // InternalDsl.g:1025:2: ( rule__Robot__JointAssignment_4_1 )*
            {
             before(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 
            // InternalDsl.g:1026:2: ( rule__Robot__JointAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:1026:3: rule__Robot__JointAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Robot__JointAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getJointAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalDsl.g:1035:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalDsl.g:1040:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalDsl.g:1047:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1051:1: ( ( () ) )
            // InternalDsl.g:1052:1: ( () )
            {
            // InternalDsl.g:1052:1: ( () )
            // InternalDsl.g:1053:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalDsl.g:1054:2: ()
            // InternalDsl.g:1054:3: 
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
    // InternalDsl.g:1062:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalDsl.g:1067:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1074:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1078:1: ( ( 'Link' ) )
            // InternalDsl.g:1079:1: ( 'Link' )
            {
            // InternalDsl.g:1079:1: ( 'Link' )
            // InternalDsl.g:1080:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:1089:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalDsl.g:1094:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1101:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1105:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalDsl.g:1106:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalDsl.g:1106:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalDsl.g:1107:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalDsl.g:1108:2: ( rule__Link__NameAssignment_2 )
            // InternalDsl.g:1108:3: rule__Link__NameAssignment_2
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
    // InternalDsl.g:1116:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1120:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalDsl.g:1121:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1128:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1132:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalDsl.g:1133:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalDsl.g:1133:1: ( ( rule__Link__Group_3__0 )? )
            // InternalDsl.g:1134:2: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalDsl.g:1135:2: ( rule__Link__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1135:3: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalDsl.g:1143:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1147:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalDsl.g:1148:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1155:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1159:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalDsl.g:1160:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalDsl.g:1160:1: ( ( rule__Link__Group_4__0 )? )
            // InternalDsl.g:1161:2: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalDsl.g:1162:2: ( rule__Link__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1162:3: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalDsl.g:1170:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( rule__Link__Group__5__Impl )
            // InternalDsl.g:1175:2: rule__Link__Group__5__Impl
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
    // InternalDsl.g:1181:1: rule__Link__Group__5__Impl : ( ( rule__Link__Group_5__0 )? ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( ( ( rule__Link__Group_5__0 )? ) )
            // InternalDsl.g:1186:1: ( ( rule__Link__Group_5__0 )? )
            {
            // InternalDsl.g:1186:1: ( ( rule__Link__Group_5__0 )? )
            // InternalDsl.g:1187:2: ( rule__Link__Group_5__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_5()); 
            // InternalDsl.g:1188:2: ( rule__Link__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1188:3: rule__Link__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group_3__0"
    // InternalDsl.g:1197:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1201:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalDsl.g:1202:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__1();

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
    // $ANTLR end "rule__Link__Group_3__0"


    // $ANTLR start "rule__Link__Group_3__0__Impl"
    // InternalDsl.g:1209:1: rule__Link__Group_3__0__Impl : ( 'inertial' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1213:1: ( ( 'inertial' ) )
            // InternalDsl.g:1214:1: ( 'inertial' )
            {
            // InternalDsl.g:1214:1: ( 'inertial' )
            // InternalDsl.g:1215:2: 'inertial'
            {
             before(grammarAccess.getLinkAccess().getInertialKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getInertialKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3__1"
    // InternalDsl.g:1224:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1228:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalDsl.g:1229:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__2();

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
    // $ANTLR end "rule__Link__Group_3__1"


    // $ANTLR start "rule__Link__Group_3__1__Impl"
    // InternalDsl.g:1236:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__InertialAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1240:1: ( ( ( rule__Link__InertialAssignment_3_1 ) ) )
            // InternalDsl.g:1241:1: ( ( rule__Link__InertialAssignment_3_1 ) )
            {
            // InternalDsl.g:1241:1: ( ( rule__Link__InertialAssignment_3_1 ) )
            // InternalDsl.g:1242:2: ( rule__Link__InertialAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3_1()); 
            // InternalDsl.g:1243:2: ( rule__Link__InertialAssignment_3_1 )
            // InternalDsl.g:1243:3: rule__Link__InertialAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__InertialAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getInertialAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group_3__2"
    // InternalDsl.g:1251:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1255:1: ( rule__Link__Group_3__2__Impl )
            // InternalDsl.g:1256:2: rule__Link__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__2__Impl();

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
    // $ANTLR end "rule__Link__Group_3__2"


    // $ANTLR start "rule__Link__Group_3__2__Impl"
    // InternalDsl.g:1262:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__InertialAssignment_3_2 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( ( ( rule__Link__InertialAssignment_3_2 )* ) )
            // InternalDsl.g:1267:1: ( ( rule__Link__InertialAssignment_3_2 )* )
            {
            // InternalDsl.g:1267:1: ( ( rule__Link__InertialAssignment_3_2 )* )
            // InternalDsl.g:1268:2: ( rule__Link__InertialAssignment_3_2 )*
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3_2()); 
            // InternalDsl.g:1269:2: ( rule__Link__InertialAssignment_3_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1269:3: rule__Link__InertialAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Link__InertialAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getInertialAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__2__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalDsl.g:1278:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1282:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalDsl.g:1283:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1();

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
    // $ANTLR end "rule__Link__Group_4__0"


    // $ANTLR start "rule__Link__Group_4__0__Impl"
    // InternalDsl.g:1290:1: rule__Link__Group_4__0__Impl : ( 'visuals' ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1294:1: ( ( 'visuals' ) )
            // InternalDsl.g:1295:1: ( 'visuals' )
            {
            // InternalDsl.g:1295:1: ( 'visuals' )
            // InternalDsl.g:1296:2: 'visuals'
            {
             before(grammarAccess.getLinkAccess().getVisualsKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getVisualsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0__Impl"


    // $ANTLR start "rule__Link__Group_4__1"
    // InternalDsl.g:1305:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl rule__Link__Group_4__2 ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1309:1: ( rule__Link__Group_4__1__Impl rule__Link__Group_4__2 )
            // InternalDsl.g:1310:2: rule__Link__Group_4__1__Impl rule__Link__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__2();

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
    // $ANTLR end "rule__Link__Group_4__1"


    // $ANTLR start "rule__Link__Group_4__1__Impl"
    // InternalDsl.g:1317:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__VisualsAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1321:1: ( ( ( rule__Link__VisualsAssignment_4_1 ) ) )
            // InternalDsl.g:1322:1: ( ( rule__Link__VisualsAssignment_4_1 ) )
            {
            // InternalDsl.g:1322:1: ( ( rule__Link__VisualsAssignment_4_1 ) )
            // InternalDsl.g:1323:2: ( rule__Link__VisualsAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_4_1()); 
            // InternalDsl.g:1324:2: ( rule__Link__VisualsAssignment_4_1 )
            // InternalDsl.g:1324:3: rule__Link__VisualsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__VisualsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getVisualsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1__Impl"


    // $ANTLR start "rule__Link__Group_4__2"
    // InternalDsl.g:1332:1: rule__Link__Group_4__2 : rule__Link__Group_4__2__Impl ;
    public final void rule__Link__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1336:1: ( rule__Link__Group_4__2__Impl )
            // InternalDsl.g:1337:2: rule__Link__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_4__2__Impl();

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
    // $ANTLR end "rule__Link__Group_4__2"


    // $ANTLR start "rule__Link__Group_4__2__Impl"
    // InternalDsl.g:1343:1: rule__Link__Group_4__2__Impl : ( ( rule__Link__VisualsAssignment_4_2 )* ) ;
    public final void rule__Link__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( ( ( rule__Link__VisualsAssignment_4_2 )* ) )
            // InternalDsl.g:1348:1: ( ( rule__Link__VisualsAssignment_4_2 )* )
            {
            // InternalDsl.g:1348:1: ( ( rule__Link__VisualsAssignment_4_2 )* )
            // InternalDsl.g:1349:2: ( rule__Link__VisualsAssignment_4_2 )*
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_4_2()); 
            // InternalDsl.g:1350:2: ( rule__Link__VisualsAssignment_4_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1350:3: rule__Link__VisualsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Link__VisualsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getVisualsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__2__Impl"


    // $ANTLR start "rule__Link__Group_5__0"
    // InternalDsl.g:1359:1: rule__Link__Group_5__0 : rule__Link__Group_5__0__Impl rule__Link__Group_5__1 ;
    public final void rule__Link__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1363:1: ( rule__Link__Group_5__0__Impl rule__Link__Group_5__1 )
            // InternalDsl.g:1364:2: rule__Link__Group_5__0__Impl rule__Link__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Link__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1();

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
    // $ANTLR end "rule__Link__Group_5__0"


    // $ANTLR start "rule__Link__Group_5__0__Impl"
    // InternalDsl.g:1371:1: rule__Link__Group_5__0__Impl : ( 'collision' ) ;
    public final void rule__Link__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1375:1: ( ( 'collision' ) )
            // InternalDsl.g:1376:1: ( 'collision' )
            {
            // InternalDsl.g:1376:1: ( 'collision' )
            // InternalDsl.g:1377:2: 'collision'
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__0__Impl"


    // $ANTLR start "rule__Link__Group_5__1"
    // InternalDsl.g:1386:1: rule__Link__Group_5__1 : rule__Link__Group_5__1__Impl rule__Link__Group_5__2 ;
    public final void rule__Link__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1390:1: ( rule__Link__Group_5__1__Impl rule__Link__Group_5__2 )
            // InternalDsl.g:1391:2: rule__Link__Group_5__1__Impl rule__Link__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Link__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__2();

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
    // $ANTLR end "rule__Link__Group_5__1"


    // $ANTLR start "rule__Link__Group_5__1__Impl"
    // InternalDsl.g:1398:1: rule__Link__Group_5__1__Impl : ( ( rule__Link__CollisionAssignment_5_1 ) ) ;
    public final void rule__Link__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1402:1: ( ( ( rule__Link__CollisionAssignment_5_1 ) ) )
            // InternalDsl.g:1403:1: ( ( rule__Link__CollisionAssignment_5_1 ) )
            {
            // InternalDsl.g:1403:1: ( ( rule__Link__CollisionAssignment_5_1 ) )
            // InternalDsl.g:1404:2: ( rule__Link__CollisionAssignment_5_1 )
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_5_1()); 
            // InternalDsl.g:1405:2: ( rule__Link__CollisionAssignment_5_1 )
            // InternalDsl.g:1405:3: rule__Link__CollisionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__CollisionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getCollisionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__1__Impl"


    // $ANTLR start "rule__Link__Group_5__2"
    // InternalDsl.g:1413:1: rule__Link__Group_5__2 : rule__Link__Group_5__2__Impl ;
    public final void rule__Link__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1417:1: ( rule__Link__Group_5__2__Impl )
            // InternalDsl.g:1418:2: rule__Link__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_5__2__Impl();

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
    // $ANTLR end "rule__Link__Group_5__2"


    // $ANTLR start "rule__Link__Group_5__2__Impl"
    // InternalDsl.g:1424:1: rule__Link__Group_5__2__Impl : ( ( rule__Link__CollisionAssignment_5_2 )* ) ;
    public final void rule__Link__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( ( ( rule__Link__CollisionAssignment_5_2 )* ) )
            // InternalDsl.g:1429:1: ( ( rule__Link__CollisionAssignment_5_2 )* )
            {
            // InternalDsl.g:1429:1: ( ( rule__Link__CollisionAssignment_5_2 )* )
            // InternalDsl.g:1430:2: ( rule__Link__CollisionAssignment_5_2 )*
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_5_2()); 
            // InternalDsl.g:1431:2: ( rule__Link__CollisionAssignment_5_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1431:3: rule__Link__CollisionAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Link__CollisionAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getCollisionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__2__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalDsl.g:1440:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1444:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalDsl.g:1445:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:1452:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1456:1: ( ( 'Joint' ) )
            // InternalDsl.g:1457:1: ( 'Joint' )
            {
            // InternalDsl.g:1457:1: ( 'Joint' )
            // InternalDsl.g:1458:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1467:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1471:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalDsl.g:1472:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1479:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1483:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalDsl.g:1484:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalDsl.g:1484:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalDsl.g:1485:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalDsl.g:1486:2: ( rule__Joint__NameAssignment_1 )
            // InternalDsl.g:1486:3: rule__Joint__NameAssignment_1
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
    // InternalDsl.g:1494:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1498:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalDsl.g:1499:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1506:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Group_2__0 )? ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1510:1: ( ( ( rule__Joint__Group_2__0 )? ) )
            // InternalDsl.g:1511:1: ( ( rule__Joint__Group_2__0 )? )
            {
            // InternalDsl.g:1511:1: ( ( rule__Joint__Group_2__0 )? )
            // InternalDsl.g:1512:2: ( rule__Joint__Group_2__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_2()); 
            // InternalDsl.g:1513:2: ( rule__Joint__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1513:3: rule__Joint__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDsl.g:1521:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1525:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalDsl.g:1526:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:1533:1: rule__Joint__Group__3__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1537:1: ( ( 'ChildOf' ) )
            // InternalDsl.g:1538:1: ( 'ChildOf' )
            {
            // InternalDsl.g:1538:1: ( 'ChildOf' )
            // InternalDsl.g:1539:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_3()); 

            }


            }

        }
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
    // InternalDsl.g:1548:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1552:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalDsl.g:1553:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1560:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__ChildOfAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1564:1: ( ( ( rule__Joint__ChildOfAssignment_4 ) ) )
            // InternalDsl.g:1565:1: ( ( rule__Joint__ChildOfAssignment_4 ) )
            {
            // InternalDsl.g:1565:1: ( ( rule__Joint__ChildOfAssignment_4 ) )
            // InternalDsl.g:1566:2: ( rule__Joint__ChildOfAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_4()); 
            // InternalDsl.g:1567:2: ( rule__Joint__ChildOfAssignment_4 )
            // InternalDsl.g:1567:3: rule__Joint__ChildOfAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_4()); 

            }


            }

        }
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
    // InternalDsl.g:1575:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1579:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalDsl.g:1580:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:1587:1: rule__Joint__Group__5__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1591:1: ( ( 'ParentOf' ) )
            // InternalDsl.g:1592:1: ( 'ParentOf' )
            {
            // InternalDsl.g:1592:1: ( 'ParentOf' )
            // InternalDsl.g:1593:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_5()); 

            }


            }

        }
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
    // InternalDsl.g:1602:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1606:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalDsl.g:1607:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1614:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ParentOfAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1618:1: ( ( ( rule__Joint__ParentOfAssignment_6 ) ) )
            // InternalDsl.g:1619:1: ( ( rule__Joint__ParentOfAssignment_6 ) )
            {
            // InternalDsl.g:1619:1: ( ( rule__Joint__ParentOfAssignment_6 ) )
            // InternalDsl.g:1620:2: ( rule__Joint__ParentOfAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_6()); 
            // InternalDsl.g:1621:2: ( rule__Joint__ParentOfAssignment_6 )
            // InternalDsl.g:1621:3: rule__Joint__ParentOfAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_6()); 

            }


            }

        }
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
    // InternalDsl.g:1629:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1633:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalDsl.g:1634:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1641:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__Group_7__0 )? ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1645:1: ( ( ( rule__Joint__Group_7__0 )? ) )
            // InternalDsl.g:1646:1: ( ( rule__Joint__Group_7__0 )? )
            {
            // InternalDsl.g:1646:1: ( ( rule__Joint__Group_7__0 )? )
            // InternalDsl.g:1647:2: ( rule__Joint__Group_7__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_7()); 
            // InternalDsl.g:1648:2: ( rule__Joint__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1648:3: rule__Joint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalDsl.g:1656:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1660:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalDsl.g:1661:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1668:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Group_8__0 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1672:1: ( ( ( rule__Joint__Group_8__0 )? ) )
            // InternalDsl.g:1673:1: ( ( rule__Joint__Group_8__0 )? )
            {
            // InternalDsl.g:1673:1: ( ( rule__Joint__Group_8__0 )? )
            // InternalDsl.g:1674:2: ( rule__Joint__Group_8__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_8()); 
            // InternalDsl.g:1675:2: ( rule__Joint__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1675:3: rule__Joint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalDsl.g:1683:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1687:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalDsl.g:1688:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1695:1: rule__Joint__Group__9__Impl : ( 'origin' ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1699:1: ( ( 'origin' ) )
            // InternalDsl.g:1700:1: ( 'origin' )
            {
            // InternalDsl.g:1700:1: ( 'origin' )
            // InternalDsl.g:1701:2: 'origin'
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_9()); 

            }


            }

        }
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
    // InternalDsl.g:1710:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1714:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalDsl.g:1715:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1722:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__OriginAssignment_10 ) ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1726:1: ( ( ( rule__Joint__OriginAssignment_10 ) ) )
            // InternalDsl.g:1727:1: ( ( rule__Joint__OriginAssignment_10 ) )
            {
            // InternalDsl.g:1727:1: ( ( rule__Joint__OriginAssignment_10 ) )
            // InternalDsl.g:1728:2: ( rule__Joint__OriginAssignment_10 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_10()); 
            // InternalDsl.g:1729:2: ( rule__Joint__OriginAssignment_10 )
            // InternalDsl.g:1729:3: rule__Joint__OriginAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_10()); 

            }


            }

        }
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
    // InternalDsl.g:1737:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1741:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalDsl.g:1742:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__12();

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
    // InternalDsl.g:1749:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1753:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalDsl.g:1754:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalDsl.g:1754:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalDsl.g:1755:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalDsl.g:1756:2: ( rule__Joint__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1756:3: rule__Joint__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__Group__12"
    // InternalDsl.g:1764:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1768:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalDsl.g:1769:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__13();

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
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // InternalDsl.g:1776:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1780:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalDsl.g:1781:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalDsl.g:1781:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalDsl.g:1782:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalDsl.g:1783:2: ( rule__Joint__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1783:3: rule__Joint__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group__13"
    // InternalDsl.g:1791:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1795:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // InternalDsl.g:1796:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__14();

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
    // $ANTLR end "rule__Joint__Group__13"


    // $ANTLR start "rule__Joint__Group__13__Impl"
    // InternalDsl.g:1803:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Group_13__0 )? ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1807:1: ( ( ( rule__Joint__Group_13__0 )? ) )
            // InternalDsl.g:1808:1: ( ( rule__Joint__Group_13__0 )? )
            {
            // InternalDsl.g:1808:1: ( ( rule__Joint__Group_13__0 )? )
            // InternalDsl.g:1809:2: ( rule__Joint__Group_13__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_13()); 
            // InternalDsl.g:1810:2: ( rule__Joint__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1810:3: rule__Joint__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13__Impl"


    // $ANTLR start "rule__Joint__Group__14"
    // InternalDsl.g:1818:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1822:1: ( rule__Joint__Group__14__Impl )
            // InternalDsl.g:1823:2: rule__Joint__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__14__Impl();

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
    // $ANTLR end "rule__Joint__Group__14"


    // $ANTLR start "rule__Joint__Group__14__Impl"
    // InternalDsl.g:1829:1: rule__Joint__Group__14__Impl : ( ( rule__Joint__Group_14__0 )? ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1833:1: ( ( ( rule__Joint__Group_14__0 )? ) )
            // InternalDsl.g:1834:1: ( ( rule__Joint__Group_14__0 )? )
            {
            // InternalDsl.g:1834:1: ( ( rule__Joint__Group_14__0 )? )
            // InternalDsl.g:1835:2: ( rule__Joint__Group_14__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_14()); 
            // InternalDsl.g:1836:2: ( rule__Joint__Group_14__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1836:3: rule__Joint__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14__Impl"


    // $ANTLR start "rule__Joint__Group_2__0"
    // InternalDsl.g:1845:1: rule__Joint__Group_2__0 : rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1 ;
    public final void rule__Joint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1849:1: ( rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1 )
            // InternalDsl.g:1850:2: rule__Joint__Group_2__0__Impl rule__Joint__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Joint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2__1();

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
    // $ANTLR end "rule__Joint__Group_2__0"


    // $ANTLR start "rule__Joint__Group_2__0__Impl"
    // InternalDsl.g:1857:1: rule__Joint__Group_2__0__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1861:1: ( ( 'Type' ) )
            // InternalDsl.g:1862:1: ( 'Type' )
            {
            // InternalDsl.g:1862:1: ( 'Type' )
            // InternalDsl.g:1863:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_2__0__Impl"


    // $ANTLR start "rule__Joint__Group_2__1"
    // InternalDsl.g:1872:1: rule__Joint__Group_2__1 : rule__Joint__Group_2__1__Impl ;
    public final void rule__Joint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1876:1: ( rule__Joint__Group_2__1__Impl )
            // InternalDsl.g:1877:2: rule__Joint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_2__1"


    // $ANTLR start "rule__Joint__Group_2__1__Impl"
    // InternalDsl.g:1883:1: rule__Joint__Group_2__1__Impl : ( ( rule__Joint__TypeAssignment_2_1 ) ) ;
    public final void rule__Joint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1887:1: ( ( ( rule__Joint__TypeAssignment_2_1 ) ) )
            // InternalDsl.g:1888:1: ( ( rule__Joint__TypeAssignment_2_1 ) )
            {
            // InternalDsl.g:1888:1: ( ( rule__Joint__TypeAssignment_2_1 ) )
            // InternalDsl.g:1889:2: ( rule__Joint__TypeAssignment_2_1 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2_1()); 
            // InternalDsl.g:1890:2: ( rule__Joint__TypeAssignment_2_1 )
            // InternalDsl.g:1890:3: rule__Joint__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_2__1__Impl"


    // $ANTLR start "rule__Joint__Group_7__0"
    // InternalDsl.g:1899:1: rule__Joint__Group_7__0 : rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 ;
    public final void rule__Joint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1903:1: ( rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 )
            // InternalDsl.g:1904:2: rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1
            {
            pushFollow(FOLLOW_23);
            rule__Joint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1();

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
    // $ANTLR end "rule__Joint__Group_7__0"


    // $ANTLR start "rule__Joint__Group_7__0__Impl"
    // InternalDsl.g:1911:1: rule__Joint__Group_7__0__Impl : ( 'limit' ) ;
    public final void rule__Joint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1915:1: ( ( 'limit' ) )
            // InternalDsl.g:1916:1: ( 'limit' )
            {
            // InternalDsl.g:1916:1: ( 'limit' )
            // InternalDsl.g:1917:2: 'limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__0__Impl"


    // $ANTLR start "rule__Joint__Group_7__1"
    // InternalDsl.g:1926:1: rule__Joint__Group_7__1 : rule__Joint__Group_7__1__Impl ;
    public final void rule__Joint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1930:1: ( rule__Joint__Group_7__1__Impl )
            // InternalDsl.g:1931:2: rule__Joint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_7__1"


    // $ANTLR start "rule__Joint__Group_7__1__Impl"
    // InternalDsl.g:1937:1: rule__Joint__Group_7__1__Impl : ( ( rule__Joint__LimitAssignment_7_1 ) ) ;
    public final void rule__Joint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1941:1: ( ( ( rule__Joint__LimitAssignment_7_1 ) ) )
            // InternalDsl.g:1942:1: ( ( rule__Joint__LimitAssignment_7_1 ) )
            {
            // InternalDsl.g:1942:1: ( ( rule__Joint__LimitAssignment_7_1 ) )
            // InternalDsl.g:1943:2: ( rule__Joint__LimitAssignment_7_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_7_1()); 
            // InternalDsl.g:1944:2: ( rule__Joint__LimitAssignment_7_1 )
            // InternalDsl.g:1944:3: rule__Joint__LimitAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__1__Impl"


    // $ANTLR start "rule__Joint__Group_8__0"
    // InternalDsl.g:1953:1: rule__Joint__Group_8__0 : rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 ;
    public final void rule__Joint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1957:1: ( rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 )
            // InternalDsl.g:1958:2: rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1
            {
            pushFollow(FOLLOW_24);
            rule__Joint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1();

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
    // $ANTLR end "rule__Joint__Group_8__0"


    // $ANTLR start "rule__Joint__Group_8__0__Impl"
    // InternalDsl.g:1965:1: rule__Joint__Group_8__0__Impl : ( 'axis' ) ;
    public final void rule__Joint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1969:1: ( ( 'axis' ) )
            // InternalDsl.g:1970:1: ( 'axis' )
            {
            // InternalDsl.g:1970:1: ( 'axis' )
            // InternalDsl.g:1971:2: 'axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0__Impl"


    // $ANTLR start "rule__Joint__Group_8__1"
    // InternalDsl.g:1980:1: rule__Joint__Group_8__1 : rule__Joint__Group_8__1__Impl ;
    public final void rule__Joint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1984:1: ( rule__Joint__Group_8__1__Impl )
            // InternalDsl.g:1985:2: rule__Joint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_8__1"


    // $ANTLR start "rule__Joint__Group_8__1__Impl"
    // InternalDsl.g:1991:1: rule__Joint__Group_8__1__Impl : ( ( rule__Joint__AxisAssignment_8_1 ) ) ;
    public final void rule__Joint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1995:1: ( ( ( rule__Joint__AxisAssignment_8_1 ) ) )
            // InternalDsl.g:1996:1: ( ( rule__Joint__AxisAssignment_8_1 ) )
            {
            // InternalDsl.g:1996:1: ( ( rule__Joint__AxisAssignment_8_1 ) )
            // InternalDsl.g:1997:2: ( rule__Joint__AxisAssignment_8_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_8_1()); 
            // InternalDsl.g:1998:2: ( rule__Joint__AxisAssignment_8_1 )
            // InternalDsl.g:1998:3: rule__Joint__AxisAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1__Impl"


    // $ANTLR start "rule__Joint__Group_11__0"
    // InternalDsl.g:2007:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2011:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalDsl.g:2012:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_25);
            rule__Joint__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1();

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
    // $ANTLR end "rule__Joint__Group_11__0"


    // $ANTLR start "rule__Joint__Group_11__0__Impl"
    // InternalDsl.g:2019:1: rule__Joint__Group_11__0__Impl : ( 'callibration' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2023:1: ( ( 'callibration' ) )
            // InternalDsl.g:2024:1: ( 'callibration' )
            {
            // InternalDsl.g:2024:1: ( 'callibration' )
            // InternalDsl.g:2025:2: 'callibration'
            {
             before(grammarAccess.getJointAccess().getCallibrationKeyword_11_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getCallibrationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0__Impl"


    // $ANTLR start "rule__Joint__Group_11__1"
    // InternalDsl.g:2034:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2038:1: ( rule__Joint__Group_11__1__Impl )
            // InternalDsl.g:2039:2: rule__Joint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_11__1"


    // $ANTLR start "rule__Joint__Group_11__1__Impl"
    // InternalDsl.g:2045:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__CallibrationAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2049:1: ( ( ( rule__Joint__CallibrationAssignment_11_1 ) ) )
            // InternalDsl.g:2050:1: ( ( rule__Joint__CallibrationAssignment_11_1 ) )
            {
            // InternalDsl.g:2050:1: ( ( rule__Joint__CallibrationAssignment_11_1 ) )
            // InternalDsl.g:2051:2: ( rule__Joint__CallibrationAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getCallibrationAssignment_11_1()); 
            // InternalDsl.g:2052:2: ( rule__Joint__CallibrationAssignment_11_1 )
            // InternalDsl.g:2052:3: rule__Joint__CallibrationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__CallibrationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getCallibrationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1__Impl"


    // $ANTLR start "rule__Joint__Group_12__0"
    // InternalDsl.g:2061:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2065:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalDsl.g:2066:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
            {
            pushFollow(FOLLOW_26);
            rule__Joint__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1();

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
    // $ANTLR end "rule__Joint__Group_12__0"


    // $ANTLR start "rule__Joint__Group_12__0__Impl"
    // InternalDsl.g:2073:1: rule__Joint__Group_12__0__Impl : ( 'dynamics' ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2077:1: ( ( 'dynamics' ) )
            // InternalDsl.g:2078:1: ( 'dynamics' )
            {
            // InternalDsl.g:2078:1: ( 'dynamics' )
            // InternalDsl.g:2079:2: 'dynamics'
            {
             before(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0__Impl"


    // $ANTLR start "rule__Joint__Group_12__1"
    // InternalDsl.g:2088:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2092:1: ( rule__Joint__Group_12__1__Impl )
            // InternalDsl.g:2093:2: rule__Joint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_12__1"


    // $ANTLR start "rule__Joint__Group_12__1__Impl"
    // InternalDsl.g:2099:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__DynamicsAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2103:1: ( ( ( rule__Joint__DynamicsAssignment_12_1 ) ) )
            // InternalDsl.g:2104:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            {
            // InternalDsl.g:2104:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            // InternalDsl.g:2105:2: ( rule__Joint__DynamicsAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 
            // InternalDsl.g:2106:2: ( rule__Joint__DynamicsAssignment_12_1 )
            // InternalDsl.g:2106:3: rule__Joint__DynamicsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__DynamicsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1__Impl"


    // $ANTLR start "rule__Joint__Group_13__0"
    // InternalDsl.g:2115:1: rule__Joint__Group_13__0 : rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 ;
    public final void rule__Joint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2119:1: ( rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 )
            // InternalDsl.g:2120:2: rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1
            {
            pushFollow(FOLLOW_27);
            rule__Joint__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1();

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
    // $ANTLR end "rule__Joint__Group_13__0"


    // $ANTLR start "rule__Joint__Group_13__0__Impl"
    // InternalDsl.g:2127:1: rule__Joint__Group_13__0__Impl : ( 'mimic' ) ;
    public final void rule__Joint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2131:1: ( ( 'mimic' ) )
            // InternalDsl.g:2132:1: ( 'mimic' )
            {
            // InternalDsl.g:2132:1: ( 'mimic' )
            // InternalDsl.g:2133:2: 'mimic'
            {
             before(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0__Impl"


    // $ANTLR start "rule__Joint__Group_13__1"
    // InternalDsl.g:2142:1: rule__Joint__Group_13__1 : rule__Joint__Group_13__1__Impl ;
    public final void rule__Joint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2146:1: ( rule__Joint__Group_13__1__Impl )
            // InternalDsl.g:2147:2: rule__Joint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_13__1"


    // $ANTLR start "rule__Joint__Group_13__1__Impl"
    // InternalDsl.g:2153:1: rule__Joint__Group_13__1__Impl : ( ( rule__Joint__MimicAssignment_13_1 ) ) ;
    public final void rule__Joint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2157:1: ( ( ( rule__Joint__MimicAssignment_13_1 ) ) )
            // InternalDsl.g:2158:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            {
            // InternalDsl.g:2158:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            // InternalDsl.g:2159:2: ( rule__Joint__MimicAssignment_13_1 )
            {
             before(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 
            // InternalDsl.g:2160:2: ( rule__Joint__MimicAssignment_13_1 )
            // InternalDsl.g:2160:3: rule__Joint__MimicAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__MimicAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1__Impl"


    // $ANTLR start "rule__Joint__Group_14__0"
    // InternalDsl.g:2169:1: rule__Joint__Group_14__0 : rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 ;
    public final void rule__Joint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2173:1: ( rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 )
            // InternalDsl.g:2174:2: rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1
            {
            pushFollow(FOLLOW_28);
            rule__Joint__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1();

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
    // $ANTLR end "rule__Joint__Group_14__0"


    // $ANTLR start "rule__Joint__Group_14__0__Impl"
    // InternalDsl.g:2181:1: rule__Joint__Group_14__0__Impl : ( 'safetycontroller' ) ;
    public final void rule__Joint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2185:1: ( ( 'safetycontroller' ) )
            // InternalDsl.g:2186:1: ( 'safetycontroller' )
            {
            // InternalDsl.g:2186:1: ( 'safetycontroller' )
            // InternalDsl.g:2187:2: 'safetycontroller'
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerKeyword_14_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getSafetycontrollerKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__0__Impl"


    // $ANTLR start "rule__Joint__Group_14__1"
    // InternalDsl.g:2196:1: rule__Joint__Group_14__1 : rule__Joint__Group_14__1__Impl ;
    public final void rule__Joint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2200:1: ( rule__Joint__Group_14__1__Impl )
            // InternalDsl.g:2201:2: rule__Joint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_14__1"


    // $ANTLR start "rule__Joint__Group_14__1__Impl"
    // InternalDsl.g:2207:1: rule__Joint__Group_14__1__Impl : ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) ;
    public final void rule__Joint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2211:1: ( ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) )
            // InternalDsl.g:2212:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            {
            // InternalDsl.g:2212:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            // InternalDsl.g:2213:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 
            // InternalDsl.g:2214:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            // InternalDsl.g:2214:3: rule__Joint__SafetycontrollerAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__SafetycontrollerAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalDsl.g:2223:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2227:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalDsl.g:2228:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2235:1: rule__Inertial__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2239:1: ( ( 'origin' ) )
            // InternalDsl.g:2240:1: ( 'origin' )
            {
            // InternalDsl.g:2240:1: ( 'origin' )
            // InternalDsl.g:2241:2: 'origin'
            {
             before(grammarAccess.getInertialAccess().getOriginKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getOriginKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:2250:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2254:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalDsl.g:2255:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:2262:1: rule__Inertial__Group__1__Impl : ( ( rule__Inertial__OriginAssignment_1 ) ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2266:1: ( ( ( rule__Inertial__OriginAssignment_1 ) ) )
            // InternalDsl.g:2267:1: ( ( rule__Inertial__OriginAssignment_1 ) )
            {
            // InternalDsl.g:2267:1: ( ( rule__Inertial__OriginAssignment_1 ) )
            // InternalDsl.g:2268:2: ( rule__Inertial__OriginAssignment_1 )
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_1()); 
            // InternalDsl.g:2269:2: ( rule__Inertial__OriginAssignment_1 )
            // InternalDsl.g:2269:3: rule__Inertial__OriginAssignment_1
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
    // InternalDsl.g:2277:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2281:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalDsl.g:2282:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:2289:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__Group_2__0 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2293:1: ( ( ( rule__Inertial__Group_2__0 )? ) )
            // InternalDsl.g:2294:1: ( ( rule__Inertial__Group_2__0 )? )
            {
            // InternalDsl.g:2294:1: ( ( rule__Inertial__Group_2__0 )? )
            // InternalDsl.g:2295:2: ( rule__Inertial__Group_2__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_2()); 
            // InternalDsl.g:2296:2: ( rule__Inertial__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:2296:3: rule__Inertial__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDsl.g:2304:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2308:1: ( rule__Inertial__Group__3__Impl )
            // InternalDsl.g:2309:2: rule__Inertial__Group__3__Impl
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
    // InternalDsl.g:2315:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__Group_3__0 )? ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2319:1: ( ( ( rule__Inertial__Group_3__0 )? ) )
            // InternalDsl.g:2320:1: ( ( rule__Inertial__Group_3__0 )? )
            {
            // InternalDsl.g:2320:1: ( ( rule__Inertial__Group_3__0 )? )
            // InternalDsl.g:2321:2: ( rule__Inertial__Group_3__0 )?
            {
             before(grammarAccess.getInertialAccess().getGroup_3()); 
            // InternalDsl.g:2322:2: ( rule__Inertial__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2322:3: rule__Inertial__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inertial__Group_2__0"
    // InternalDsl.g:2331:1: rule__Inertial__Group_2__0 : rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 ;
    public final void rule__Inertial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2335:1: ( rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1 )
            // InternalDsl.g:2336:2: rule__Inertial__Group_2__0__Impl rule__Inertial__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Inertial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2__1();

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
    // $ANTLR end "rule__Inertial__Group_2__0"


    // $ANTLR start "rule__Inertial__Group_2__0__Impl"
    // InternalDsl.g:2343:1: rule__Inertial__Group_2__0__Impl : ( 'mass' ) ;
    public final void rule__Inertial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2347:1: ( ( 'mass' ) )
            // InternalDsl.g:2348:1: ( 'mass' )
            {
            // InternalDsl.g:2348:1: ( 'mass' )
            // InternalDsl.g:2349:2: 'mass'
            {
             before(grammarAccess.getInertialAccess().getMassKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getMassKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__0__Impl"


    // $ANTLR start "rule__Inertial__Group_2__1"
    // InternalDsl.g:2358:1: rule__Inertial__Group_2__1 : rule__Inertial__Group_2__1__Impl rule__Inertial__Group_2__2 ;
    public final void rule__Inertial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2362:1: ( rule__Inertial__Group_2__1__Impl rule__Inertial__Group_2__2 )
            // InternalDsl.g:2363:2: rule__Inertial__Group_2__1__Impl rule__Inertial__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Inertial__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2__2();

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
    // $ANTLR end "rule__Inertial__Group_2__1"


    // $ANTLR start "rule__Inertial__Group_2__1__Impl"
    // InternalDsl.g:2370:1: rule__Inertial__Group_2__1__Impl : ( ( rule__Inertial__MassAssignment_2_1 ) ) ;
    public final void rule__Inertial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2374:1: ( ( ( rule__Inertial__MassAssignment_2_1 ) ) )
            // InternalDsl.g:2375:1: ( ( rule__Inertial__MassAssignment_2_1 ) )
            {
            // InternalDsl.g:2375:1: ( ( rule__Inertial__MassAssignment_2_1 ) )
            // InternalDsl.g:2376:2: ( rule__Inertial__MassAssignment_2_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_2_1()); 
            // InternalDsl.g:2377:2: ( rule__Inertial__MassAssignment_2_1 )
            // InternalDsl.g:2377:3: rule__Inertial__MassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__1__Impl"


    // $ANTLR start "rule__Inertial__Group_2__2"
    // InternalDsl.g:2385:1: rule__Inertial__Group_2__2 : rule__Inertial__Group_2__2__Impl ;
    public final void rule__Inertial__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2389:1: ( rule__Inertial__Group_2__2__Impl )
            // InternalDsl.g:2390:2: rule__Inertial__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2__2__Impl();

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
    // $ANTLR end "rule__Inertial__Group_2__2"


    // $ANTLR start "rule__Inertial__Group_2__2__Impl"
    // InternalDsl.g:2396:1: rule__Inertial__Group_2__2__Impl : ( ( rule__Inertial__Group_2_2__0 )* ) ;
    public final void rule__Inertial__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2400:1: ( ( ( rule__Inertial__Group_2_2__0 )* ) )
            // InternalDsl.g:2401:1: ( ( rule__Inertial__Group_2_2__0 )* )
            {
            // InternalDsl.g:2401:1: ( ( rule__Inertial__Group_2_2__0 )* )
            // InternalDsl.g:2402:2: ( rule__Inertial__Group_2_2__0 )*
            {
             before(grammarAccess.getInertialAccess().getGroup_2_2()); 
            // InternalDsl.g:2403:2: ( rule__Inertial__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==42) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2403:3: rule__Inertial__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Inertial__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInertialAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2__2__Impl"


    // $ANTLR start "rule__Inertial__Group_2_2__0"
    // InternalDsl.g:2412:1: rule__Inertial__Group_2_2__0 : rule__Inertial__Group_2_2__0__Impl rule__Inertial__Group_2_2__1 ;
    public final void rule__Inertial__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2416:1: ( rule__Inertial__Group_2_2__0__Impl rule__Inertial__Group_2_2__1 )
            // InternalDsl.g:2417:2: rule__Inertial__Group_2_2__0__Impl rule__Inertial__Group_2_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Inertial__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2_2__1();

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
    // $ANTLR end "rule__Inertial__Group_2_2__0"


    // $ANTLR start "rule__Inertial__Group_2_2__0__Impl"
    // InternalDsl.g:2424:1: rule__Inertial__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Inertial__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2428:1: ( ( ',' ) )
            // InternalDsl.g:2429:1: ( ',' )
            {
            // InternalDsl.g:2429:1: ( ',' )
            // InternalDsl.g:2430:2: ','
            {
             before(grammarAccess.getInertialAccess().getCommaKeyword_2_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2_2__0__Impl"


    // $ANTLR start "rule__Inertial__Group_2_2__1"
    // InternalDsl.g:2439:1: rule__Inertial__Group_2_2__1 : rule__Inertial__Group_2_2__1__Impl ;
    public final void rule__Inertial__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2443:1: ( rule__Inertial__Group_2_2__1__Impl )
            // InternalDsl.g:2444:2: rule__Inertial__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Inertial__Group_2_2__1"


    // $ANTLR start "rule__Inertial__Group_2_2__1__Impl"
    // InternalDsl.g:2450:1: rule__Inertial__Group_2_2__1__Impl : ( ( rule__Inertial__MassAssignment_2_2_1 ) ) ;
    public final void rule__Inertial__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2454:1: ( ( ( rule__Inertial__MassAssignment_2_2_1 ) ) )
            // InternalDsl.g:2455:1: ( ( rule__Inertial__MassAssignment_2_2_1 ) )
            {
            // InternalDsl.g:2455:1: ( ( rule__Inertial__MassAssignment_2_2_1 ) )
            // InternalDsl.g:2456:2: ( rule__Inertial__MassAssignment_2_2_1 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_2_2_1()); 
            // InternalDsl.g:2457:2: ( rule__Inertial__MassAssignment_2_2_1 )
            // InternalDsl.g:2457:3: rule__Inertial__MassAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_2_2__1__Impl"


    // $ANTLR start "rule__Inertial__Group_3__0"
    // InternalDsl.g:2466:1: rule__Inertial__Group_3__0 : rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 ;
    public final void rule__Inertial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2470:1: ( rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1 )
            // InternalDsl.g:2471:2: rule__Inertial__Group_3__0__Impl rule__Inertial__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Inertial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_3__1();

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
    // $ANTLR end "rule__Inertial__Group_3__0"


    // $ANTLR start "rule__Inertial__Group_3__0__Impl"
    // InternalDsl.g:2478:1: rule__Inertial__Group_3__0__Impl : ( 'inertia' ) ;
    public final void rule__Inertial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2482:1: ( ( 'inertia' ) )
            // InternalDsl.g:2483:1: ( 'inertia' )
            {
            // InternalDsl.g:2483:1: ( 'inertia' )
            // InternalDsl.g:2484:2: 'inertia'
            {
             before(grammarAccess.getInertialAccess().getInertiaKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertiaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__0__Impl"


    // $ANTLR start "rule__Inertial__Group_3__1"
    // InternalDsl.g:2493:1: rule__Inertial__Group_3__1 : rule__Inertial__Group_3__1__Impl rule__Inertial__Group_3__2 ;
    public final void rule__Inertial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2497:1: ( rule__Inertial__Group_3__1__Impl rule__Inertial__Group_3__2 )
            // InternalDsl.g:2498:2: rule__Inertial__Group_3__1__Impl rule__Inertial__Group_3__2
            {
            pushFollow(FOLLOW_32);
            rule__Inertial__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group_3__2();

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
    // $ANTLR end "rule__Inertial__Group_3__1"


    // $ANTLR start "rule__Inertial__Group_3__1__Impl"
    // InternalDsl.g:2505:1: rule__Inertial__Group_3__1__Impl : ( ( rule__Inertial__InertiaAssignment_3_1 ) ) ;
    public final void rule__Inertial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2509:1: ( ( ( rule__Inertial__InertiaAssignment_3_1 ) ) )
            // InternalDsl.g:2510:1: ( ( rule__Inertial__InertiaAssignment_3_1 ) )
            {
            // InternalDsl.g:2510:1: ( ( rule__Inertial__InertiaAssignment_3_1 ) )
            // InternalDsl.g:2511:2: ( rule__Inertial__InertiaAssignment_3_1 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3_1()); 
            // InternalDsl.g:2512:2: ( rule__Inertial__InertiaAssignment_3_1 )
            // InternalDsl.g:2512:3: rule__Inertial__InertiaAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__1__Impl"


    // $ANTLR start "rule__Inertial__Group_3__2"
    // InternalDsl.g:2520:1: rule__Inertial__Group_3__2 : rule__Inertial__Group_3__2__Impl ;
    public final void rule__Inertial__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2524:1: ( rule__Inertial__Group_3__2__Impl )
            // InternalDsl.g:2525:2: rule__Inertial__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group_3__2__Impl();

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
    // $ANTLR end "rule__Inertial__Group_3__2"


    // $ANTLR start "rule__Inertial__Group_3__2__Impl"
    // InternalDsl.g:2531:1: rule__Inertial__Group_3__2__Impl : ( ( rule__Inertial__InertiaAssignment_3_2 )* ) ;
    public final void rule__Inertial__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2535:1: ( ( ( rule__Inertial__InertiaAssignment_3_2 )* ) )
            // InternalDsl.g:2536:1: ( ( rule__Inertial__InertiaAssignment_3_2 )* )
            {
            // InternalDsl.g:2536:1: ( ( rule__Inertial__InertiaAssignment_3_2 )* )
            // InternalDsl.g:2537:2: ( rule__Inertial__InertiaAssignment_3_2 )*
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3_2()); 
            // InternalDsl.g:2538:2: ( rule__Inertial__InertiaAssignment_3_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:2538:3: rule__Inertial__InertiaAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Inertial__InertiaAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getInertialAccess().getInertiaAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group_3__2__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalDsl.g:2547:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2551:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalDsl.g:2552:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:2559:1: rule__Visual__Group__0__Impl : ( ( rule__Visual__Group_0__0 )? ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2563:1: ( ( ( rule__Visual__Group_0__0 )? ) )
            // InternalDsl.g:2564:1: ( ( rule__Visual__Group_0__0 )? )
            {
            // InternalDsl.g:2564:1: ( ( rule__Visual__Group_0__0 )? )
            // InternalDsl.g:2565:2: ( rule__Visual__Group_0__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_0()); 
            // InternalDsl.g:2566:2: ( rule__Visual__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2566:3: rule__Visual__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalDsl.g:2574:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2578:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalDsl.g:2579:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2586:1: rule__Visual__Group__1__Impl : ( 'origin' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2590:1: ( ( 'origin' ) )
            // InternalDsl.g:2591:1: ( 'origin' )
            {
            // InternalDsl.g:2591:1: ( 'origin' )
            // InternalDsl.g:2592:2: 'origin'
            {
             before(grammarAccess.getVisualAccess().getOriginKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getOriginKeyword_1()); 

            }


            }

        }
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
    // InternalDsl.g:2601:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2605:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalDsl.g:2606:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:2613:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__OriginAssignment_2 ) ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2617:1: ( ( ( rule__Visual__OriginAssignment_2 ) ) )
            // InternalDsl.g:2618:1: ( ( rule__Visual__OriginAssignment_2 ) )
            {
            // InternalDsl.g:2618:1: ( ( rule__Visual__OriginAssignment_2 ) )
            // InternalDsl.g:2619:2: ( rule__Visual__OriginAssignment_2 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_2()); 
            // InternalDsl.g:2620:2: ( rule__Visual__OriginAssignment_2 )
            // InternalDsl.g:2620:3: rule__Visual__OriginAssignment_2
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
    // InternalDsl.g:2628:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2632:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalDsl.g:2633:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

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
    // InternalDsl.g:2640:1: rule__Visual__Group__3__Impl : ( 'geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2644:1: ( ( 'geometry' ) )
            // InternalDsl.g:2645:1: ( 'geometry' )
            {
            // InternalDsl.g:2645:1: ( 'geometry' )
            // InternalDsl.g:2646:2: 'geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Visual__Group__4"
    // InternalDsl.g:2655:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2659:1: ( rule__Visual__Group__4__Impl )
            // InternalDsl.g:2660:2: rule__Visual__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__4__Impl();

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
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalDsl.g:2666:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 ) ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2670:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) )
            // InternalDsl.g:2671:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            {
            // InternalDsl.g:2671:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            // InternalDsl.g:2672:2: ( rule__Visual__GeometryAssignment_4 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalDsl.g:2673:2: ( rule__Visual__GeometryAssignment_4 )
            // InternalDsl.g:2673:3: rule__Visual__GeometryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group_0__0"
    // InternalDsl.g:2682:1: rule__Visual__Group_0__0 : rule__Visual__Group_0__0__Impl rule__Visual__Group_0__1 ;
    public final void rule__Visual__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2686:1: ( rule__Visual__Group_0__0__Impl rule__Visual__Group_0__1 )
            // InternalDsl.g:2687:2: rule__Visual__Group_0__0__Impl rule__Visual__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Visual__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_0__1();

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
    // $ANTLR end "rule__Visual__Group_0__0"


    // $ANTLR start "rule__Visual__Group_0__0__Impl"
    // InternalDsl.g:2694:1: rule__Visual__Group_0__0__Impl : ( 'material' ) ;
    public final void rule__Visual__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2698:1: ( ( 'material' ) )
            // InternalDsl.g:2699:1: ( 'material' )
            {
            // InternalDsl.g:2699:1: ( 'material' )
            // InternalDsl.g:2700:2: 'material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getMaterialKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_0__0__Impl"


    // $ANTLR start "rule__Visual__Group_0__1"
    // InternalDsl.g:2709:1: rule__Visual__Group_0__1 : rule__Visual__Group_0__1__Impl ;
    public final void rule__Visual__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2713:1: ( rule__Visual__Group_0__1__Impl )
            // InternalDsl.g:2714:2: rule__Visual__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_0__1__Impl();

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
    // $ANTLR end "rule__Visual__Group_0__1"


    // $ANTLR start "rule__Visual__Group_0__1__Impl"
    // InternalDsl.g:2720:1: rule__Visual__Group_0__1__Impl : ( ( rule__Visual__MaterialAssignment_0_1 ) ) ;
    public final void rule__Visual__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2724:1: ( ( ( rule__Visual__MaterialAssignment_0_1 ) ) )
            // InternalDsl.g:2725:1: ( ( rule__Visual__MaterialAssignment_0_1 ) )
            {
            // InternalDsl.g:2725:1: ( ( rule__Visual__MaterialAssignment_0_1 ) )
            // InternalDsl.g:2726:2: ( rule__Visual__MaterialAssignment_0_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_0_1()); 
            // InternalDsl.g:2727:2: ( rule__Visual__MaterialAssignment_0_1 )
            // InternalDsl.g:2727:3: rule__Visual__MaterialAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__MaterialAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_0__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalDsl.g:2736:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2740:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalDsl.g:2741:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:2748:1: rule__Collision__Group__0__Impl : ( 'geometry' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2752:1: ( ( 'geometry' ) )
            // InternalDsl.g:2753:1: ( 'geometry' )
            {
            // InternalDsl.g:2753:1: ( 'geometry' )
            // InternalDsl.g:2754:2: 'geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_0()); 

            }


            }

        }
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
    // InternalDsl.g:2763:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2767:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalDsl.g:2768:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
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
    // InternalDsl.g:2775:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__GeometryAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2779:1: ( ( ( rule__Collision__GeometryAssignment_1 ) ) )
            // InternalDsl.g:2780:1: ( ( rule__Collision__GeometryAssignment_1 ) )
            {
            // InternalDsl.g:2780:1: ( ( rule__Collision__GeometryAssignment_1 ) )
            // InternalDsl.g:2781:2: ( rule__Collision__GeometryAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_1()); 
            // InternalDsl.g:2782:2: ( rule__Collision__GeometryAssignment_1 )
            // InternalDsl.g:2782:3: rule__Collision__GeometryAssignment_1
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
    // InternalDsl.g:2790:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2794:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalDsl.g:2795:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

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
    // InternalDsl.g:2802:1: rule__Collision__Group__2__Impl : ( 'origin' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2806:1: ( ( 'origin' ) )
            // InternalDsl.g:2807:1: ( 'origin' )
            {
            // InternalDsl.g:2807:1: ( 'origin' )
            // InternalDsl.g:2808:2: 'origin'
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getOriginKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Collision__Group__3"
    // InternalDsl.g:2817:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2821:1: ( rule__Collision__Group__3__Impl )
            // InternalDsl.g:2822:2: rule__Collision__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__3__Impl();

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
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalDsl.g:2828:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__OriginAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2832:1: ( ( ( rule__Collision__OriginAssignment_3 ) ) )
            // InternalDsl.g:2833:1: ( ( rule__Collision__OriginAssignment_3 ) )
            {
            // InternalDsl.g:2833:1: ( ( rule__Collision__OriginAssignment_3 ) )
            // InternalDsl.g:2834:2: ( rule__Collision__OriginAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_3()); 
            // InternalDsl.g:2835:2: ( rule__Collision__OriginAssignment_3 )
            // InternalDsl.g:2835:3: rule__Collision__OriginAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalDsl.g:2844:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2848:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalDsl.g:2849:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2856:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2860:1: ( ( () ) )
            // InternalDsl.g:2861:1: ( () )
            {
            // InternalDsl.g:2861:1: ( () )
            // InternalDsl.g:2862:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalDsl.g:2863:2: ()
            // InternalDsl.g:2863:3: 
            {
            }

             after(grammarAccess.getOriginAccess().getOriginAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalDsl.g:2871:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2875:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalDsl.g:2876:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2883:1: rule__Origin__Group__1__Impl : ( ( rule__Origin__Group_1__0 )? ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2887:1: ( ( ( rule__Origin__Group_1__0 )? ) )
            // InternalDsl.g:2888:1: ( ( rule__Origin__Group_1__0 )? )
            {
            // InternalDsl.g:2888:1: ( ( rule__Origin__Group_1__0 )? )
            // InternalDsl.g:2889:2: ( rule__Origin__Group_1__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_1()); 
            // InternalDsl.g:2890:2: ( rule__Origin__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2890:3: rule__Origin__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:2898:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2902:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalDsl.g:2903:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2910:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__Group_2__0 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2914:1: ( ( ( rule__Origin__Group_2__0 )? ) )
            // InternalDsl.g:2915:1: ( ( rule__Origin__Group_2__0 )? )
            {
            // InternalDsl.g:2915:1: ( ( rule__Origin__Group_2__0 )? )
            // InternalDsl.g:2916:2: ( rule__Origin__Group_2__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_2()); 
            // InternalDsl.g:2917:2: ( rule__Origin__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2917:3: rule__Origin__Group_2__0
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
    // InternalDsl.g:2925:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2929:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalDsl.g:2930:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2937:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__Group_3__0 )? ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2941:1: ( ( ( rule__Origin__Group_3__0 )? ) )
            // InternalDsl.g:2942:1: ( ( rule__Origin__Group_3__0 )? )
            {
            // InternalDsl.g:2942:1: ( ( rule__Origin__Group_3__0 )? )
            // InternalDsl.g:2943:2: ( rule__Origin__Group_3__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_3()); 
            // InternalDsl.g:2944:2: ( rule__Origin__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:2944:3: rule__Origin__Group_3__0
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
    // InternalDsl.g:2952:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2956:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalDsl.g:2957:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2964:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__Group_4__0 )? ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2968:1: ( ( ( rule__Origin__Group_4__0 )? ) )
            // InternalDsl.g:2969:1: ( ( rule__Origin__Group_4__0 )? )
            {
            // InternalDsl.g:2969:1: ( ( rule__Origin__Group_4__0 )? )
            // InternalDsl.g:2970:2: ( rule__Origin__Group_4__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_4()); 
            // InternalDsl.g:2971:2: ( rule__Origin__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:2971:3: rule__Origin__Group_4__0
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
    // InternalDsl.g:2979:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2983:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalDsl.g:2984:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2991:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__Group_5__0 )? ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2995:1: ( ( ( rule__Origin__Group_5__0 )? ) )
            // InternalDsl.g:2996:1: ( ( rule__Origin__Group_5__0 )? )
            {
            // InternalDsl.g:2996:1: ( ( rule__Origin__Group_5__0 )? )
            // InternalDsl.g:2997:2: ( rule__Origin__Group_5__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_5()); 
            // InternalDsl.g:2998:2: ( rule__Origin__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:2998:3: rule__Origin__Group_5__0
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
    // InternalDsl.g:3006:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3010:1: ( rule__Origin__Group__6__Impl )
            // InternalDsl.g:3011:2: rule__Origin__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__6__Impl();

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
    // InternalDsl.g:3017:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__Group_6__0 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3021:1: ( ( ( rule__Origin__Group_6__0 )? ) )
            // InternalDsl.g:3022:1: ( ( rule__Origin__Group_6__0 )? )
            {
            // InternalDsl.g:3022:1: ( ( rule__Origin__Group_6__0 )? )
            // InternalDsl.g:3023:2: ( rule__Origin__Group_6__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_6()); 
            // InternalDsl.g:3024:2: ( rule__Origin__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3024:3: rule__Origin__Group_6__0
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


    // $ANTLR start "rule__Origin__Group_1__0"
    // InternalDsl.g:3033:1: rule__Origin__Group_1__0 : rule__Origin__Group_1__0__Impl rule__Origin__Group_1__1 ;
    public final void rule__Origin__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3037:1: ( rule__Origin__Group_1__0__Impl rule__Origin__Group_1__1 )
            // InternalDsl.g:3038:2: rule__Origin__Group_1__0__Impl rule__Origin__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Origin__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_1__1();

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
    // $ANTLR end "rule__Origin__Group_1__0"


    // $ANTLR start "rule__Origin__Group_1__0__Impl"
    // InternalDsl.g:3045:1: rule__Origin__Group_1__0__Impl : ( 'x' ) ;
    public final void rule__Origin__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3049:1: ( ( 'x' ) )
            // InternalDsl.g:3050:1: ( 'x' )
            {
            // InternalDsl.g:3050:1: ( 'x' )
            // InternalDsl.g:3051:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_1__0__Impl"


    // $ANTLR start "rule__Origin__Group_1__1"
    // InternalDsl.g:3060:1: rule__Origin__Group_1__1 : rule__Origin__Group_1__1__Impl ;
    public final void rule__Origin__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3064:1: ( rule__Origin__Group_1__1__Impl )
            // InternalDsl.g:3065:2: rule__Origin__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_1__1__Impl();

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
    // $ANTLR end "rule__Origin__Group_1__1"


    // $ANTLR start "rule__Origin__Group_1__1__Impl"
    // InternalDsl.g:3071:1: rule__Origin__Group_1__1__Impl : ( ( rule__Origin__XAssignment_1_1 ) ) ;
    public final void rule__Origin__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3075:1: ( ( ( rule__Origin__XAssignment_1_1 ) ) )
            // InternalDsl.g:3076:1: ( ( rule__Origin__XAssignment_1_1 ) )
            {
            // InternalDsl.g:3076:1: ( ( rule__Origin__XAssignment_1_1 ) )
            // InternalDsl.g:3077:2: ( rule__Origin__XAssignment_1_1 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_1_1()); 
            // InternalDsl.g:3078:2: ( rule__Origin__XAssignment_1_1 )
            // InternalDsl.g:3078:3: rule__Origin__XAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_1__1__Impl"


    // $ANTLR start "rule__Origin__Group_2__0"
    // InternalDsl.g:3087:1: rule__Origin__Group_2__0 : rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1 ;
    public final void rule__Origin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3091:1: ( rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1 )
            // InternalDsl.g:3092:2: rule__Origin__Group_2__0__Impl rule__Origin__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3099:1: rule__Origin__Group_2__0__Impl : ( 'y' ) ;
    public final void rule__Origin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3103:1: ( ( 'y' ) )
            // InternalDsl.g:3104:1: ( 'y' )
            {
            // InternalDsl.g:3104:1: ( 'y' )
            // InternalDsl.g:3105:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYKeyword_2_0()); 

            }


            }

        }
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
    // InternalDsl.g:3114:1: rule__Origin__Group_2__1 : rule__Origin__Group_2__1__Impl ;
    public final void rule__Origin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3118:1: ( rule__Origin__Group_2__1__Impl )
            // InternalDsl.g:3119:2: rule__Origin__Group_2__1__Impl
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
    // InternalDsl.g:3125:1: rule__Origin__Group_2__1__Impl : ( ( rule__Origin__YAssignment_2_1 ) ) ;
    public final void rule__Origin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3129:1: ( ( ( rule__Origin__YAssignment_2_1 ) ) )
            // InternalDsl.g:3130:1: ( ( rule__Origin__YAssignment_2_1 ) )
            {
            // InternalDsl.g:3130:1: ( ( rule__Origin__YAssignment_2_1 ) )
            // InternalDsl.g:3131:2: ( rule__Origin__YAssignment_2_1 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_2_1()); 
            // InternalDsl.g:3132:2: ( rule__Origin__YAssignment_2_1 )
            // InternalDsl.g:3132:3: rule__Origin__YAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_2_1()); 

            }


            }

        }
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
    // InternalDsl.g:3141:1: rule__Origin__Group_3__0 : rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1 ;
    public final void rule__Origin__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3145:1: ( rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1 )
            // InternalDsl.g:3146:2: rule__Origin__Group_3__0__Impl rule__Origin__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3153:1: rule__Origin__Group_3__0__Impl : ( 'z' ) ;
    public final void rule__Origin__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3157:1: ( ( 'z' ) )
            // InternalDsl.g:3158:1: ( 'z' )
            {
            // InternalDsl.g:3158:1: ( 'z' )
            // InternalDsl.g:3159:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getZKeyword_3_0()); 

            }


            }

        }
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
    // InternalDsl.g:3168:1: rule__Origin__Group_3__1 : rule__Origin__Group_3__1__Impl ;
    public final void rule__Origin__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3172:1: ( rule__Origin__Group_3__1__Impl )
            // InternalDsl.g:3173:2: rule__Origin__Group_3__1__Impl
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
    // InternalDsl.g:3179:1: rule__Origin__Group_3__1__Impl : ( ( rule__Origin__ZAssignment_3_1 ) ) ;
    public final void rule__Origin__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3183:1: ( ( ( rule__Origin__ZAssignment_3_1 ) ) )
            // InternalDsl.g:3184:1: ( ( rule__Origin__ZAssignment_3_1 ) )
            {
            // InternalDsl.g:3184:1: ( ( rule__Origin__ZAssignment_3_1 ) )
            // InternalDsl.g:3185:2: ( rule__Origin__ZAssignment_3_1 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_3_1()); 
            // InternalDsl.g:3186:2: ( rule__Origin__ZAssignment_3_1 )
            // InternalDsl.g:3186:3: rule__Origin__ZAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_3_1()); 

            }


            }

        }
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
    // InternalDsl.g:3195:1: rule__Origin__Group_4__0 : rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1 ;
    public final void rule__Origin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3199:1: ( rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1 )
            // InternalDsl.g:3200:2: rule__Origin__Group_4__0__Impl rule__Origin__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3207:1: rule__Origin__Group_4__0__Impl : ( 'Roll' ) ;
    public final void rule__Origin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3211:1: ( ( 'Roll' ) )
            // InternalDsl.g:3212:1: ( 'Roll' )
            {
            // InternalDsl.g:3212:1: ( 'Roll' )
            // InternalDsl.g:3213:2: 'Roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRollKeyword_4_0()); 

            }


            }

        }
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
    // InternalDsl.g:3222:1: rule__Origin__Group_4__1 : rule__Origin__Group_4__1__Impl ;
    public final void rule__Origin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3226:1: ( rule__Origin__Group_4__1__Impl )
            // InternalDsl.g:3227:2: rule__Origin__Group_4__1__Impl
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
    // InternalDsl.g:3233:1: rule__Origin__Group_4__1__Impl : ( ( rule__Origin__RollAssignment_4_1 ) ) ;
    public final void rule__Origin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3237:1: ( ( ( rule__Origin__RollAssignment_4_1 ) ) )
            // InternalDsl.g:3238:1: ( ( rule__Origin__RollAssignment_4_1 ) )
            {
            // InternalDsl.g:3238:1: ( ( rule__Origin__RollAssignment_4_1 ) )
            // InternalDsl.g:3239:2: ( rule__Origin__RollAssignment_4_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_4_1()); 
            // InternalDsl.g:3240:2: ( rule__Origin__RollAssignment_4_1 )
            // InternalDsl.g:3240:3: rule__Origin__RollAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_4_1()); 

            }


            }

        }
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
    // InternalDsl.g:3249:1: rule__Origin__Group_5__0 : rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1 ;
    public final void rule__Origin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3253:1: ( rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1 )
            // InternalDsl.g:3254:2: rule__Origin__Group_5__0__Impl rule__Origin__Group_5__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3261:1: rule__Origin__Group_5__0__Impl : ( 'Pitch' ) ;
    public final void rule__Origin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3265:1: ( ( 'Pitch' ) )
            // InternalDsl.g:3266:1: ( 'Pitch' )
            {
            // InternalDsl.g:3266:1: ( 'Pitch' )
            // InternalDsl.g:3267:2: 'Pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getPitchKeyword_5_0()); 

            }


            }

        }
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
    // InternalDsl.g:3276:1: rule__Origin__Group_5__1 : rule__Origin__Group_5__1__Impl ;
    public final void rule__Origin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3280:1: ( rule__Origin__Group_5__1__Impl )
            // InternalDsl.g:3281:2: rule__Origin__Group_5__1__Impl
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
    // InternalDsl.g:3287:1: rule__Origin__Group_5__1__Impl : ( ( rule__Origin__PitchAssignment_5_1 ) ) ;
    public final void rule__Origin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3291:1: ( ( ( rule__Origin__PitchAssignment_5_1 ) ) )
            // InternalDsl.g:3292:1: ( ( rule__Origin__PitchAssignment_5_1 ) )
            {
            // InternalDsl.g:3292:1: ( ( rule__Origin__PitchAssignment_5_1 ) )
            // InternalDsl.g:3293:2: ( rule__Origin__PitchAssignment_5_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_5_1()); 
            // InternalDsl.g:3294:2: ( rule__Origin__PitchAssignment_5_1 )
            // InternalDsl.g:3294:3: rule__Origin__PitchAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_5_1()); 

            }


            }

        }
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
    // InternalDsl.g:3303:1: rule__Origin__Group_6__0 : rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 ;
    public final void rule__Origin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3307:1: ( rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 )
            // InternalDsl.g:3308:2: rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:3315:1: rule__Origin__Group_6__0__Impl : ( 'Yaw' ) ;
    public final void rule__Origin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3319:1: ( ( 'Yaw' ) )
            // InternalDsl.g:3320:1: ( 'Yaw' )
            {
            // InternalDsl.g:3320:1: ( 'Yaw' )
            // InternalDsl.g:3321:2: 'Yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYawKeyword_6_0()); 

            }


            }

        }
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
    // InternalDsl.g:3330:1: rule__Origin__Group_6__1 : rule__Origin__Group_6__1__Impl ;
    public final void rule__Origin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3334:1: ( rule__Origin__Group_6__1__Impl )
            // InternalDsl.g:3335:2: rule__Origin__Group_6__1__Impl
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
    // InternalDsl.g:3341:1: rule__Origin__Group_6__1__Impl : ( ( rule__Origin__YawAssignment_6_1 ) ) ;
    public final void rule__Origin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3345:1: ( ( ( rule__Origin__YawAssignment_6_1 ) ) )
            // InternalDsl.g:3346:1: ( ( rule__Origin__YawAssignment_6_1 ) )
            {
            // InternalDsl.g:3346:1: ( ( rule__Origin__YawAssignment_6_1 ) )
            // InternalDsl.g:3347:2: ( rule__Origin__YawAssignment_6_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_6_1()); 
            // InternalDsl.g:3348:2: ( rule__Origin__YawAssignment_6_1 )
            // InternalDsl.g:3348:3: rule__Origin__YawAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mass__Group__0"
    // InternalDsl.g:3357:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3361:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalDsl.g:3362:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDsl.g:3369:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3373:1: ( ( () ) )
            // InternalDsl.g:3374:1: ( () )
            {
            // InternalDsl.g:3374:1: ( () )
            // InternalDsl.g:3375:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalDsl.g:3376:2: ()
            // InternalDsl.g:3376:3: 
            {
            }

             after(grammarAccess.getMassAccess().getMassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalDsl.g:3384:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3388:1: ( rule__Mass__Group__1__Impl )
            // InternalDsl.g:3389:2: rule__Mass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__1__Impl();

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
    // InternalDsl.g:3395:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3399:1: ( ( 'Mass' ) )
            // InternalDsl.g:3400:1: ( 'Mass' )
            {
            // InternalDsl.g:3400:1: ( 'Mass' )
            // InternalDsl.g:3401:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,42,FOLLOW_2); 
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


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalDsl.g:3411:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3415:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalDsl.g:3416:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDsl.g:3423:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3427:1: ( ( () ) )
            // InternalDsl.g:3428:1: ( () )
            {
            // InternalDsl.g:3428:1: ( () )
            // InternalDsl.g:3429:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalDsl.g:3430:2: ()
            // InternalDsl.g:3430:3: 
            {
            }

             after(grammarAccess.getInertiaAccess().getInertiaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalDsl.g:3438:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3442:1: ( rule__Inertia__Group__1__Impl )
            // InternalDsl.g:3443:2: rule__Inertia__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1__Impl();

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
    // InternalDsl.g:3449:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3453:1: ( ( 'Inertia' ) )
            // InternalDsl.g:3454:1: ( 'Inertia' )
            {
            // InternalDsl.g:3454:1: ( 'Inertia' )
            // InternalDsl.g:3455:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__Material_Impl__Group__0"
    // InternalDsl.g:3465:1: rule__Material_Impl__Group__0 : rule__Material_Impl__Group__0__Impl rule__Material_Impl__Group__1 ;
    public final void rule__Material_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3469:1: ( rule__Material_Impl__Group__0__Impl rule__Material_Impl__Group__1 )
            // InternalDsl.g:3470:2: rule__Material_Impl__Group__0__Impl rule__Material_Impl__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Material_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Material_Impl__Group__1();

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
    // $ANTLR end "rule__Material_Impl__Group__0"


    // $ANTLR start "rule__Material_Impl__Group__0__Impl"
    // InternalDsl.g:3477:1: rule__Material_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Material_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3481:1: ( ( () ) )
            // InternalDsl.g:3482:1: ( () )
            {
            // InternalDsl.g:3482:1: ( () )
            // InternalDsl.g:3483:2: ()
            {
             before(grammarAccess.getMaterial_ImplAccess().getMaterialAction_0()); 
            // InternalDsl.g:3484:2: ()
            // InternalDsl.g:3484:3: 
            {
            }

             after(grammarAccess.getMaterial_ImplAccess().getMaterialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material_Impl__Group__0__Impl"


    // $ANTLR start "rule__Material_Impl__Group__1"
    // InternalDsl.g:3492:1: rule__Material_Impl__Group__1 : rule__Material_Impl__Group__1__Impl ;
    public final void rule__Material_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3496:1: ( rule__Material_Impl__Group__1__Impl )
            // InternalDsl.g:3497:2: rule__Material_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Material_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Material_Impl__Group__1"


    // $ANTLR start "rule__Material_Impl__Group__1__Impl"
    // InternalDsl.g:3503:1: rule__Material_Impl__Group__1__Impl : ( 'Material' ) ;
    public final void rule__Material_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3507:1: ( ( 'Material' ) )
            // InternalDsl.g:3508:1: ( 'Material' )
            {
            // InternalDsl.g:3508:1: ( 'Material' )
            // InternalDsl.g:3509:2: 'Material'
            {
             before(grammarAccess.getMaterial_ImplAccess().getMaterialKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMaterial_ImplAccess().getMaterialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material_Impl__Group__1__Impl"


    // $ANTLR start "rule__Geometry_Impl__Group__0"
    // InternalDsl.g:3519:1: rule__Geometry_Impl__Group__0 : rule__Geometry_Impl__Group__0__Impl rule__Geometry_Impl__Group__1 ;
    public final void rule__Geometry_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3523:1: ( rule__Geometry_Impl__Group__0__Impl rule__Geometry_Impl__Group__1 )
            // InternalDsl.g:3524:2: rule__Geometry_Impl__Group__0__Impl rule__Geometry_Impl__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Geometry_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry_Impl__Group__1();

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
    // $ANTLR end "rule__Geometry_Impl__Group__0"


    // $ANTLR start "rule__Geometry_Impl__Group__0__Impl"
    // InternalDsl.g:3531:1: rule__Geometry_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Geometry_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3535:1: ( ( () ) )
            // InternalDsl.g:3536:1: ( () )
            {
            // InternalDsl.g:3536:1: ( () )
            // InternalDsl.g:3537:2: ()
            {
             before(grammarAccess.getGeometry_ImplAccess().getGeometryAction_0()); 
            // InternalDsl.g:3538:2: ()
            // InternalDsl.g:3538:3: 
            {
            }

             after(grammarAccess.getGeometry_ImplAccess().getGeometryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry_Impl__Group__0__Impl"


    // $ANTLR start "rule__Geometry_Impl__Group__1"
    // InternalDsl.g:3546:1: rule__Geometry_Impl__Group__1 : rule__Geometry_Impl__Group__1__Impl ;
    public final void rule__Geometry_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3550:1: ( rule__Geometry_Impl__Group__1__Impl )
            // InternalDsl.g:3551:2: rule__Geometry_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Geometry_Impl__Group__1"


    // $ANTLR start "rule__Geometry_Impl__Group__1__Impl"
    // InternalDsl.g:3557:1: rule__Geometry_Impl__Group__1__Impl : ( 'Geometry' ) ;
    public final void rule__Geometry_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3561:1: ( ( 'Geometry' ) )
            // InternalDsl.g:3562:1: ( 'Geometry' )
            {
            // InternalDsl.g:3562:1: ( 'Geometry' )
            // InternalDsl.g:3563:2: 'Geometry'
            {
             before(grammarAccess.getGeometry_ImplAccess().getGeometryKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGeometry_ImplAccess().getGeometryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry_Impl__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalDsl.g:3573:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3577:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalDsl.g:3578:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDsl.g:3585:1: rule__Color__Group__0__Impl : ( () ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3589:1: ( ( () ) )
            // InternalDsl.g:3590:1: ( () )
            {
            // InternalDsl.g:3590:1: ( () )
            // InternalDsl.g:3591:2: ()
            {
             before(grammarAccess.getColorAccess().getColorAction_0()); 
            // InternalDsl.g:3592:2: ()
            // InternalDsl.g:3592:3: 
            {
            }

             after(grammarAccess.getColorAccess().getColorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalDsl.g:3600:1: rule__Color__Group__1 : rule__Color__Group__1__Impl ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3604:1: ( rule__Color__Group__1__Impl )
            // InternalDsl.g:3605:2: rule__Color__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__1__Impl();

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
    // InternalDsl.g:3611:1: rule__Color__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3615:1: ( ( 'Color' ) )
            // InternalDsl.g:3616:1: ( 'Color' )
            {
            // InternalDsl.g:3616:1: ( 'Color' )
            // InternalDsl.g:3617:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_1()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__Texture__Group__0"
    // InternalDsl.g:3627:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3631:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalDsl.g:3632:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDsl.g:3639:1: rule__Texture__Group__0__Impl : ( () ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3643:1: ( ( () ) )
            // InternalDsl.g:3644:1: ( () )
            {
            // InternalDsl.g:3644:1: ( () )
            // InternalDsl.g:3645:2: ()
            {
             before(grammarAccess.getTextureAccess().getTextureAction_0()); 
            // InternalDsl.g:3646:2: ()
            // InternalDsl.g:3646:3: 
            {
            }

             after(grammarAccess.getTextureAccess().getTextureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalDsl.g:3654:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3658:1: ( rule__Texture__Group__1__Impl )
            // InternalDsl.g:3659:2: rule__Texture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__1__Impl();

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
    // InternalDsl.g:3665:1: rule__Texture__Group__1__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3669:1: ( ( 'Texture' ) )
            // InternalDsl.g:3670:1: ( 'Texture' )
            {
            // InternalDsl.g:3670:1: ( 'Texture' )
            // InternalDsl.g:3671:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_1()); 
            match(input,47,FOLLOW_2); 
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


    // $ANTLR start "rule__Box__Group__0"
    // InternalDsl.g:3681:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3685:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalDsl.g:3686:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3693:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3697:1: ( ( () ) )
            // InternalDsl.g:3698:1: ( () )
            {
            // InternalDsl.g:3698:1: ( () )
            // InternalDsl.g:3699:2: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // InternalDsl.g:3700:2: ()
            // InternalDsl.g:3700:3: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalDsl.g:3708:1: rule__Box__Group__1 : rule__Box__Group__1__Impl ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3712:1: ( rule__Box__Group__1__Impl )
            // InternalDsl.g:3713:2: rule__Box__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__1__Impl();

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
    // InternalDsl.g:3719:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3723:1: ( ( 'Box' ) )
            // InternalDsl.g:3724:1: ( 'Box' )
            {
            // InternalDsl.g:3724:1: ( 'Box' )
            // InternalDsl.g:3725:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,48,FOLLOW_2); 
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


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalDsl.g:3735:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3739:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalDsl.g:3740:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3747:1: rule__Cylinder__Group__0__Impl : ( () ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3751:1: ( ( () ) )
            // InternalDsl.g:3752:1: ( () )
            {
            // InternalDsl.g:3752:1: ( () )
            // InternalDsl.g:3753:2: ()
            {
             before(grammarAccess.getCylinderAccess().getCylinderAction_0()); 
            // InternalDsl.g:3754:2: ()
            // InternalDsl.g:3754:3: 
            {
            }

             after(grammarAccess.getCylinderAccess().getCylinderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalDsl.g:3762:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3766:1: ( rule__Cylinder__Group__1__Impl )
            // InternalDsl.g:3767:2: rule__Cylinder__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1__Impl();

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
    // InternalDsl.g:3773:1: rule__Cylinder__Group__1__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3777:1: ( ( 'Cylinder' ) )
            // InternalDsl.g:3778:1: ( 'Cylinder' )
            {
            // InternalDsl.g:3778:1: ( 'Cylinder' )
            // InternalDsl.g:3779:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_1()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalDsl.g:3789:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3793:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalDsl.g:3794:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDsl.g:3801:1: rule__Mesh__Group__0__Impl : ( () ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3805:1: ( ( () ) )
            // InternalDsl.g:3806:1: ( () )
            {
            // InternalDsl.g:3806:1: ( () )
            // InternalDsl.g:3807:2: ()
            {
             before(grammarAccess.getMeshAccess().getMeshAction_0()); 
            // InternalDsl.g:3808:2: ()
            // InternalDsl.g:3808:3: 
            {
            }

             after(grammarAccess.getMeshAccess().getMeshAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalDsl.g:3816:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3820:1: ( rule__Mesh__Group__1__Impl )
            // InternalDsl.g:3821:2: rule__Mesh__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1__Impl();

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
    // InternalDsl.g:3827:1: rule__Mesh__Group__1__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3831:1: ( ( 'Mesh' ) )
            // InternalDsl.g:3832:1: ( 'Mesh' )
            {
            // InternalDsl.g:3832:1: ( 'Mesh' )
            // InternalDsl.g:3833:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_1()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalDsl.g:3843:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3847:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalDsl.g:3848:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDsl.g:3855:1: rule__Sphere__Group__0__Impl : ( () ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3859:1: ( ( () ) )
            // InternalDsl.g:3860:1: ( () )
            {
            // InternalDsl.g:3860:1: ( () )
            // InternalDsl.g:3861:2: ()
            {
             before(grammarAccess.getSphereAccess().getSphereAction_0()); 
            // InternalDsl.g:3862:2: ()
            // InternalDsl.g:3862:3: 
            {
            }

             after(grammarAccess.getSphereAccess().getSphereAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalDsl.g:3870:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3874:1: ( rule__Sphere__Group__1__Impl )
            // InternalDsl.g:3875:2: rule__Sphere__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1__Impl();

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
    // InternalDsl.g:3881:1: rule__Sphere__Group__1__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3885:1: ( ( 'Sphere' ) )
            // InternalDsl.g:3886:1: ( 'Sphere' )
            {
            // InternalDsl.g:3886:1: ( 'Sphere' )
            // InternalDsl.g:3887:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_1()); 
            match(input,51,FOLLOW_2); 
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


    // $ANTLR start "rule__Limit__Group__0"
    // InternalDsl.g:3897:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3901:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalDsl.g:3902:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3909:1: rule__Limit__Group__0__Impl : ( () ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3913:1: ( ( () ) )
            // InternalDsl.g:3914:1: ( () )
            {
            // InternalDsl.g:3914:1: ( () )
            // InternalDsl.g:3915:2: ()
            {
             before(grammarAccess.getLimitAccess().getLimitAction_0()); 
            // InternalDsl.g:3916:2: ()
            // InternalDsl.g:3916:3: 
            {
            }

             after(grammarAccess.getLimitAccess().getLimitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalDsl.g:3924:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3928:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalDsl.g:3929:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3936:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__Group_1__0 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3940:1: ( ( ( rule__Limit__Group_1__0 )? ) )
            // InternalDsl.g:3941:1: ( ( rule__Limit__Group_1__0 )? )
            {
            // InternalDsl.g:3941:1: ( ( rule__Limit__Group_1__0 )? )
            // InternalDsl.g:3942:2: ( rule__Limit__Group_1__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_1()); 
            // InternalDsl.g:3943:2: ( rule__Limit__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3943:3: rule__Limit__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:3951:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3955:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalDsl.g:3956:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3963:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__Group_2__0 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3967:1: ( ( ( rule__Limit__Group_2__0 )? ) )
            // InternalDsl.g:3968:1: ( ( rule__Limit__Group_2__0 )? )
            {
            // InternalDsl.g:3968:1: ( ( rule__Limit__Group_2__0 )? )
            // InternalDsl.g:3969:2: ( rule__Limit__Group_2__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_2()); 
            // InternalDsl.g:3970:2: ( rule__Limit__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3970:3: rule__Limit__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDsl.g:3978:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3982:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalDsl.g:3983:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3990:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__Group_3__0 )? ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3994:1: ( ( ( rule__Limit__Group_3__0 )? ) )
            // InternalDsl.g:3995:1: ( ( rule__Limit__Group_3__0 )? )
            {
            // InternalDsl.g:3995:1: ( ( rule__Limit__Group_3__0 )? )
            // InternalDsl.g:3996:2: ( rule__Limit__Group_3__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_3()); 
            // InternalDsl.g:3997:2: ( rule__Limit__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3997:3: rule__Limit__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalDsl.g:4005:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4009:1: ( rule__Limit__Group__4__Impl )
            // InternalDsl.g:4010:2: rule__Limit__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__4__Impl();

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
    // InternalDsl.g:4016:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__Group_4__0 )? ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4020:1: ( ( ( rule__Limit__Group_4__0 )? ) )
            // InternalDsl.g:4021:1: ( ( rule__Limit__Group_4__0 )? )
            {
            // InternalDsl.g:4021:1: ( ( rule__Limit__Group_4__0 )? )
            // InternalDsl.g:4022:2: ( rule__Limit__Group_4__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_4()); 
            // InternalDsl.g:4023:2: ( rule__Limit__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:4023:3: rule__Limit__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Limit__Group_1__0"
    // InternalDsl.g:4032:1: rule__Limit__Group_1__0 : rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1 ;
    public final void rule__Limit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4036:1: ( rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1 )
            // InternalDsl.g:4037:2: rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Limit__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_1__1();

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
    // $ANTLR end "rule__Limit__Group_1__0"


    // $ANTLR start "rule__Limit__Group_1__0__Impl"
    // InternalDsl.g:4044:1: rule__Limit__Group_1__0__Impl : ( 'Lower' ) ;
    public final void rule__Limit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4048:1: ( ( 'Lower' ) )
            // InternalDsl.g:4049:1: ( 'Lower' )
            {
            // InternalDsl.g:4049:1: ( 'Lower' )
            // InternalDsl.g:4050:2: 'Lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__0__Impl"


    // $ANTLR start "rule__Limit__Group_1__1"
    // InternalDsl.g:4059:1: rule__Limit__Group_1__1 : rule__Limit__Group_1__1__Impl ;
    public final void rule__Limit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4063:1: ( rule__Limit__Group_1__1__Impl )
            // InternalDsl.g:4064:2: rule__Limit__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_1__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_1__1"


    // $ANTLR start "rule__Limit__Group_1__1__Impl"
    // InternalDsl.g:4070:1: rule__Limit__Group_1__1__Impl : ( ( rule__Limit__LowerAssignment_1_1 ) ) ;
    public final void rule__Limit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4074:1: ( ( ( rule__Limit__LowerAssignment_1_1 ) ) )
            // InternalDsl.g:4075:1: ( ( rule__Limit__LowerAssignment_1_1 ) )
            {
            // InternalDsl.g:4075:1: ( ( rule__Limit__LowerAssignment_1_1 ) )
            // InternalDsl.g:4076:2: ( rule__Limit__LowerAssignment_1_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_1_1()); 
            // InternalDsl.g:4077:2: ( rule__Limit__LowerAssignment_1_1 )
            // InternalDsl.g:4077:3: rule__Limit__LowerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__1__Impl"


    // $ANTLR start "rule__Limit__Group_2__0"
    // InternalDsl.g:4086:1: rule__Limit__Group_2__0 : rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 ;
    public final void rule__Limit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4090:1: ( rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 )
            // InternalDsl.g:4091:2: rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__Limit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1();

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
    // $ANTLR end "rule__Limit__Group_2__0"


    // $ANTLR start "rule__Limit__Group_2__0__Impl"
    // InternalDsl.g:4098:1: rule__Limit__Group_2__0__Impl : ( 'Upper' ) ;
    public final void rule__Limit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4102:1: ( ( 'Upper' ) )
            // InternalDsl.g:4103:1: ( 'Upper' )
            {
            // InternalDsl.g:4103:1: ( 'Upper' )
            // InternalDsl.g:4104:2: 'Upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__0__Impl"


    // $ANTLR start "rule__Limit__Group_2__1"
    // InternalDsl.g:4113:1: rule__Limit__Group_2__1 : rule__Limit__Group_2__1__Impl ;
    public final void rule__Limit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4117:1: ( rule__Limit__Group_2__1__Impl )
            // InternalDsl.g:4118:2: rule__Limit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_2__1"


    // $ANTLR start "rule__Limit__Group_2__1__Impl"
    // InternalDsl.g:4124:1: rule__Limit__Group_2__1__Impl : ( ( rule__Limit__UpperAssignment_2_1 ) ) ;
    public final void rule__Limit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4128:1: ( ( ( rule__Limit__UpperAssignment_2_1 ) ) )
            // InternalDsl.g:4129:1: ( ( rule__Limit__UpperAssignment_2_1 ) )
            {
            // InternalDsl.g:4129:1: ( ( rule__Limit__UpperAssignment_2_1 ) )
            // InternalDsl.g:4130:2: ( rule__Limit__UpperAssignment_2_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_2_1()); 
            // InternalDsl.g:4131:2: ( rule__Limit__UpperAssignment_2_1 )
            // InternalDsl.g:4131:3: rule__Limit__UpperAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__1__Impl"


    // $ANTLR start "rule__Limit__Group_3__0"
    // InternalDsl.g:4140:1: rule__Limit__Group_3__0 : rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 ;
    public final void rule__Limit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4144:1: ( rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1 )
            // InternalDsl.g:4145:2: rule__Limit__Group_3__0__Impl rule__Limit__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__Limit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_3__1();

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
    // $ANTLR end "rule__Limit__Group_3__0"


    // $ANTLR start "rule__Limit__Group_3__0__Impl"
    // InternalDsl.g:4152:1: rule__Limit__Group_3__0__Impl : ( 'Effort' ) ;
    public final void rule__Limit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4156:1: ( ( 'Effort' ) )
            // InternalDsl.g:4157:1: ( 'Effort' )
            {
            // InternalDsl.g:4157:1: ( 'Effort' )
            // InternalDsl.g:4158:2: 'Effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__0__Impl"


    // $ANTLR start "rule__Limit__Group_3__1"
    // InternalDsl.g:4167:1: rule__Limit__Group_3__1 : rule__Limit__Group_3__1__Impl ;
    public final void rule__Limit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4171:1: ( rule__Limit__Group_3__1__Impl )
            // InternalDsl.g:4172:2: rule__Limit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_3__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_3__1"


    // $ANTLR start "rule__Limit__Group_3__1__Impl"
    // InternalDsl.g:4178:1: rule__Limit__Group_3__1__Impl : ( ( rule__Limit__EffortAssignment_3_1 ) ) ;
    public final void rule__Limit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4182:1: ( ( ( rule__Limit__EffortAssignment_3_1 ) ) )
            // InternalDsl.g:4183:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            {
            // InternalDsl.g:4183:1: ( ( rule__Limit__EffortAssignment_3_1 ) )
            // InternalDsl.g:4184:2: ( rule__Limit__EffortAssignment_3_1 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3_1()); 
            // InternalDsl.g:4185:2: ( rule__Limit__EffortAssignment_3_1 )
            // InternalDsl.g:4185:3: rule__Limit__EffortAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_3__1__Impl"


    // $ANTLR start "rule__Limit__Group_4__0"
    // InternalDsl.g:4194:1: rule__Limit__Group_4__0 : rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 ;
    public final void rule__Limit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4198:1: ( rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1 )
            // InternalDsl.g:4199:2: rule__Limit__Group_4__0__Impl rule__Limit__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Limit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_4__1();

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
    // $ANTLR end "rule__Limit__Group_4__0"


    // $ANTLR start "rule__Limit__Group_4__0__Impl"
    // InternalDsl.g:4206:1: rule__Limit__Group_4__0__Impl : ( 'Velocity' ) ;
    public final void rule__Limit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4210:1: ( ( 'Velocity' ) )
            // InternalDsl.g:4211:1: ( 'Velocity' )
            {
            // InternalDsl.g:4211:1: ( 'Velocity' )
            // InternalDsl.g:4212:2: 'Velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__0__Impl"


    // $ANTLR start "rule__Limit__Group_4__1"
    // InternalDsl.g:4221:1: rule__Limit__Group_4__1 : rule__Limit__Group_4__1__Impl ;
    public final void rule__Limit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4225:1: ( rule__Limit__Group_4__1__Impl )
            // InternalDsl.g:4226:2: rule__Limit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_4__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_4__1"


    // $ANTLR start "rule__Limit__Group_4__1__Impl"
    // InternalDsl.g:4232:1: rule__Limit__Group_4__1__Impl : ( ( rule__Limit__VelocityAssignment_4_1 ) ) ;
    public final void rule__Limit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4236:1: ( ( ( rule__Limit__VelocityAssignment_4_1 ) ) )
            // InternalDsl.g:4237:1: ( ( rule__Limit__VelocityAssignment_4_1 ) )
            {
            // InternalDsl.g:4237:1: ( ( rule__Limit__VelocityAssignment_4_1 ) )
            // InternalDsl.g:4238:2: ( rule__Limit__VelocityAssignment_4_1 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_4_1()); 
            // InternalDsl.g:4239:2: ( rule__Limit__VelocityAssignment_4_1 )
            // InternalDsl.g:4239:3: rule__Limit__VelocityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_4__1__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalDsl.g:4248:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4252:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalDsl.g:4253:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:4260:1: rule__Axis__Group__0__Impl : ( () ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4264:1: ( ( () ) )
            // InternalDsl.g:4265:1: ( () )
            {
            // InternalDsl.g:4265:1: ( () )
            // InternalDsl.g:4266:2: ()
            {
             before(grammarAccess.getAxisAccess().getAxisAction_0()); 
            // InternalDsl.g:4267:2: ()
            // InternalDsl.g:4267:3: 
            {
            }

             after(grammarAccess.getAxisAccess().getAxisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalDsl.g:4275:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4279:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalDsl.g:4280:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:4287:1: rule__Axis__Group__1__Impl : ( ( rule__Axis__Group_1__0 )? ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4291:1: ( ( ( rule__Axis__Group_1__0 )? ) )
            // InternalDsl.g:4292:1: ( ( rule__Axis__Group_1__0 )? )
            {
            // InternalDsl.g:4292:1: ( ( rule__Axis__Group_1__0 )? )
            // InternalDsl.g:4293:2: ( rule__Axis__Group_1__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_1()); 
            // InternalDsl.g:4294:2: ( rule__Axis__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:4294:3: rule__Axis__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:4302:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4306:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalDsl.g:4307:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalDsl.g:4314:1: rule__Axis__Group__2__Impl : ( ( rule__Axis__Group_2__0 )? ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4318:1: ( ( ( rule__Axis__Group_2__0 )? ) )
            // InternalDsl.g:4319:1: ( ( rule__Axis__Group_2__0 )? )
            {
            // InternalDsl.g:4319:1: ( ( rule__Axis__Group_2__0 )? )
            // InternalDsl.g:4320:2: ( rule__Axis__Group_2__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_2()); 
            // InternalDsl.g:4321:2: ( rule__Axis__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4321:3: rule__Axis__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDsl.g:4329:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4333:1: ( rule__Axis__Group__3__Impl )
            // InternalDsl.g:4334:2: rule__Axis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__3__Impl();

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
    // InternalDsl.g:4340:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__Group_3__0 )? ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4344:1: ( ( ( rule__Axis__Group_3__0 )? ) )
            // InternalDsl.g:4345:1: ( ( rule__Axis__Group_3__0 )? )
            {
            // InternalDsl.g:4345:1: ( ( rule__Axis__Group_3__0 )? )
            // InternalDsl.g:4346:2: ( rule__Axis__Group_3__0 )?
            {
             before(grammarAccess.getAxisAccess().getGroup_3()); 
            // InternalDsl.g:4347:2: ( rule__Axis__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4347:3: rule__Axis__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis__Group_1__0"
    // InternalDsl.g:4356:1: rule__Axis__Group_1__0 : rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1 ;
    public final void rule__Axis__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4360:1: ( rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1 )
            // InternalDsl.g:4361:2: rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__1();

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
    // $ANTLR end "rule__Axis__Group_1__0"


    // $ANTLR start "rule__Axis__Group_1__0__Impl"
    // InternalDsl.g:4368:1: rule__Axis__Group_1__0__Impl : ( 'x' ) ;
    public final void rule__Axis__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4372:1: ( ( 'x' ) )
            // InternalDsl.g:4373:1: ( 'x' )
            {
            // InternalDsl.g:4373:1: ( 'x' )
            // InternalDsl.g:4374:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__0__Impl"


    // $ANTLR start "rule__Axis__Group_1__1"
    // InternalDsl.g:4383:1: rule__Axis__Group_1__1 : rule__Axis__Group_1__1__Impl ;
    public final void rule__Axis__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4387:1: ( rule__Axis__Group_1__1__Impl )
            // InternalDsl.g:4388:2: rule__Axis__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__1__Impl();

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
    // $ANTLR end "rule__Axis__Group_1__1"


    // $ANTLR start "rule__Axis__Group_1__1__Impl"
    // InternalDsl.g:4394:1: rule__Axis__Group_1__1__Impl : ( ( rule__Axis__XAssignment_1_1 ) ) ;
    public final void rule__Axis__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4398:1: ( ( ( rule__Axis__XAssignment_1_1 ) ) )
            // InternalDsl.g:4399:1: ( ( rule__Axis__XAssignment_1_1 ) )
            {
            // InternalDsl.g:4399:1: ( ( rule__Axis__XAssignment_1_1 ) )
            // InternalDsl.g:4400:2: ( rule__Axis__XAssignment_1_1 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_1_1()); 
            // InternalDsl.g:4401:2: ( rule__Axis__XAssignment_1_1 )
            // InternalDsl.g:4401:3: rule__Axis__XAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__1__Impl"


    // $ANTLR start "rule__Axis__Group_2__0"
    // InternalDsl.g:4410:1: rule__Axis__Group_2__0 : rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 ;
    public final void rule__Axis__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4414:1: ( rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1 )
            // InternalDsl.g:4415:2: rule__Axis__Group_2__0__Impl rule__Axis__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1();

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
    // $ANTLR end "rule__Axis__Group_2__0"


    // $ANTLR start "rule__Axis__Group_2__0__Impl"
    // InternalDsl.g:4422:1: rule__Axis__Group_2__0__Impl : ( 'y' ) ;
    public final void rule__Axis__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4426:1: ( ( 'y' ) )
            // InternalDsl.g:4427:1: ( 'y' )
            {
            // InternalDsl.g:4427:1: ( 'y' )
            // InternalDsl.g:4428:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__0__Impl"


    // $ANTLR start "rule__Axis__Group_2__1"
    // InternalDsl.g:4437:1: rule__Axis__Group_2__1 : rule__Axis__Group_2__1__Impl ;
    public final void rule__Axis__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4441:1: ( rule__Axis__Group_2__1__Impl )
            // InternalDsl.g:4442:2: rule__Axis__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_2__1__Impl();

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
    // $ANTLR end "rule__Axis__Group_2__1"


    // $ANTLR start "rule__Axis__Group_2__1__Impl"
    // InternalDsl.g:4448:1: rule__Axis__Group_2__1__Impl : ( ( rule__Axis__YAssignment_2_1 ) ) ;
    public final void rule__Axis__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4452:1: ( ( ( rule__Axis__YAssignment_2_1 ) ) )
            // InternalDsl.g:4453:1: ( ( rule__Axis__YAssignment_2_1 ) )
            {
            // InternalDsl.g:4453:1: ( ( rule__Axis__YAssignment_2_1 ) )
            // InternalDsl.g:4454:2: ( rule__Axis__YAssignment_2_1 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_2_1()); 
            // InternalDsl.g:4455:2: ( rule__Axis__YAssignment_2_1 )
            // InternalDsl.g:4455:3: rule__Axis__YAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_2__1__Impl"


    // $ANTLR start "rule__Axis__Group_3__0"
    // InternalDsl.g:4464:1: rule__Axis__Group_3__0 : rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 ;
    public final void rule__Axis__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4468:1: ( rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1 )
            // InternalDsl.g:4469:2: rule__Axis__Group_3__0__Impl rule__Axis__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1();

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
    // $ANTLR end "rule__Axis__Group_3__0"


    // $ANTLR start "rule__Axis__Group_3__0__Impl"
    // InternalDsl.g:4476:1: rule__Axis__Group_3__0__Impl : ( 'z' ) ;
    public final void rule__Axis__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4480:1: ( ( 'z' ) )
            // InternalDsl.g:4481:1: ( 'z' )
            {
            // InternalDsl.g:4481:1: ( 'z' )
            // InternalDsl.g:4482:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__0__Impl"


    // $ANTLR start "rule__Axis__Group_3__1"
    // InternalDsl.g:4491:1: rule__Axis__Group_3__1 : rule__Axis__Group_3__1__Impl ;
    public final void rule__Axis__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4495:1: ( rule__Axis__Group_3__1__Impl )
            // InternalDsl.g:4496:2: rule__Axis__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_3__1__Impl();

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
    // $ANTLR end "rule__Axis__Group_3__1"


    // $ANTLR start "rule__Axis__Group_3__1__Impl"
    // InternalDsl.g:4502:1: rule__Axis__Group_3__1__Impl : ( ( rule__Axis__ZAssignment_3_1 ) ) ;
    public final void rule__Axis__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4506:1: ( ( ( rule__Axis__ZAssignment_3_1 ) ) )
            // InternalDsl.g:4507:1: ( ( rule__Axis__ZAssignment_3_1 ) )
            {
            // InternalDsl.g:4507:1: ( ( rule__Axis__ZAssignment_3_1 ) )
            // InternalDsl.g:4508:2: ( rule__Axis__ZAssignment_3_1 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_3_1()); 
            // InternalDsl.g:4509:2: ( rule__Axis__ZAssignment_3_1 )
            // InternalDsl.g:4509:3: rule__Axis__ZAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_3__1__Impl"


    // $ANTLR start "rule__Callibration__Group__0"
    // InternalDsl.g:4518:1: rule__Callibration__Group__0 : rule__Callibration__Group__0__Impl rule__Callibration__Group__1 ;
    public final void rule__Callibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4522:1: ( rule__Callibration__Group__0__Impl rule__Callibration__Group__1 )
            // InternalDsl.g:4523:2: rule__Callibration__Group__0__Impl rule__Callibration__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Callibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Callibration__Group__1();

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
    // $ANTLR end "rule__Callibration__Group__0"


    // $ANTLR start "rule__Callibration__Group__0__Impl"
    // InternalDsl.g:4530:1: rule__Callibration__Group__0__Impl : ( () ) ;
    public final void rule__Callibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4534:1: ( ( () ) )
            // InternalDsl.g:4535:1: ( () )
            {
            // InternalDsl.g:4535:1: ( () )
            // InternalDsl.g:4536:2: ()
            {
             before(grammarAccess.getCallibrationAccess().getCallibrationAction_0()); 
            // InternalDsl.g:4537:2: ()
            // InternalDsl.g:4537:3: 
            {
            }

             after(grammarAccess.getCallibrationAccess().getCallibrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group__0__Impl"


    // $ANTLR start "rule__Callibration__Group__1"
    // InternalDsl.g:4545:1: rule__Callibration__Group__1 : rule__Callibration__Group__1__Impl rule__Callibration__Group__2 ;
    public final void rule__Callibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4549:1: ( rule__Callibration__Group__1__Impl rule__Callibration__Group__2 )
            // InternalDsl.g:4550:2: rule__Callibration__Group__1__Impl rule__Callibration__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Callibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Callibration__Group__2();

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
    // $ANTLR end "rule__Callibration__Group__1"


    // $ANTLR start "rule__Callibration__Group__1__Impl"
    // InternalDsl.g:4557:1: rule__Callibration__Group__1__Impl : ( ( rule__Callibration__Group_1__0 )? ) ;
    public final void rule__Callibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4561:1: ( ( ( rule__Callibration__Group_1__0 )? ) )
            // InternalDsl.g:4562:1: ( ( rule__Callibration__Group_1__0 )? )
            {
            // InternalDsl.g:4562:1: ( ( rule__Callibration__Group_1__0 )? )
            // InternalDsl.g:4563:2: ( rule__Callibration__Group_1__0 )?
            {
             before(grammarAccess.getCallibrationAccess().getGroup_1()); 
            // InternalDsl.g:4564:2: ( rule__Callibration__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:4564:3: rule__Callibration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Callibration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallibrationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group__1__Impl"


    // $ANTLR start "rule__Callibration__Group__2"
    // InternalDsl.g:4572:1: rule__Callibration__Group__2 : rule__Callibration__Group__2__Impl ;
    public final void rule__Callibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4576:1: ( rule__Callibration__Group__2__Impl )
            // InternalDsl.g:4577:2: rule__Callibration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__Group__2__Impl();

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
    // $ANTLR end "rule__Callibration__Group__2"


    // $ANTLR start "rule__Callibration__Group__2__Impl"
    // InternalDsl.g:4583:1: rule__Callibration__Group__2__Impl : ( ( rule__Callibration__Group_2__0 )? ) ;
    public final void rule__Callibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4587:1: ( ( ( rule__Callibration__Group_2__0 )? ) )
            // InternalDsl.g:4588:1: ( ( rule__Callibration__Group_2__0 )? )
            {
            // InternalDsl.g:4588:1: ( ( rule__Callibration__Group_2__0 )? )
            // InternalDsl.g:4589:2: ( rule__Callibration__Group_2__0 )?
            {
             before(grammarAccess.getCallibrationAccess().getGroup_2()); 
            // InternalDsl.g:4590:2: ( rule__Callibration__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:4590:3: rule__Callibration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Callibration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallibrationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group__2__Impl"


    // $ANTLR start "rule__Callibration__Group_1__0"
    // InternalDsl.g:4599:1: rule__Callibration__Group_1__0 : rule__Callibration__Group_1__0__Impl rule__Callibration__Group_1__1 ;
    public final void rule__Callibration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4603:1: ( rule__Callibration__Group_1__0__Impl rule__Callibration__Group_1__1 )
            // InternalDsl.g:4604:2: rule__Callibration__Group_1__0__Impl rule__Callibration__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Callibration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Callibration__Group_1__1();

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
    // $ANTLR end "rule__Callibration__Group_1__0"


    // $ANTLR start "rule__Callibration__Group_1__0__Impl"
    // InternalDsl.g:4611:1: rule__Callibration__Group_1__0__Impl : ( 'Rising' ) ;
    public final void rule__Callibration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4615:1: ( ( 'Rising' ) )
            // InternalDsl.g:4616:1: ( 'Rising' )
            {
            // InternalDsl.g:4616:1: ( 'Rising' )
            // InternalDsl.g:4617:2: 'Rising'
            {
             before(grammarAccess.getCallibrationAccess().getRisingKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCallibrationAccess().getRisingKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group_1__0__Impl"


    // $ANTLR start "rule__Callibration__Group_1__1"
    // InternalDsl.g:4626:1: rule__Callibration__Group_1__1 : rule__Callibration__Group_1__1__Impl ;
    public final void rule__Callibration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4630:1: ( rule__Callibration__Group_1__1__Impl )
            // InternalDsl.g:4631:2: rule__Callibration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__Group_1__1__Impl();

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
    // $ANTLR end "rule__Callibration__Group_1__1"


    // $ANTLR start "rule__Callibration__Group_1__1__Impl"
    // InternalDsl.g:4637:1: rule__Callibration__Group_1__1__Impl : ( ( rule__Callibration__RisingAssignment_1_1 ) ) ;
    public final void rule__Callibration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4641:1: ( ( ( rule__Callibration__RisingAssignment_1_1 ) ) )
            // InternalDsl.g:4642:1: ( ( rule__Callibration__RisingAssignment_1_1 ) )
            {
            // InternalDsl.g:4642:1: ( ( rule__Callibration__RisingAssignment_1_1 ) )
            // InternalDsl.g:4643:2: ( rule__Callibration__RisingAssignment_1_1 )
            {
             before(grammarAccess.getCallibrationAccess().getRisingAssignment_1_1()); 
            // InternalDsl.g:4644:2: ( rule__Callibration__RisingAssignment_1_1 )
            // InternalDsl.g:4644:3: rule__Callibration__RisingAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__RisingAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCallibrationAccess().getRisingAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group_1__1__Impl"


    // $ANTLR start "rule__Callibration__Group_2__0"
    // InternalDsl.g:4653:1: rule__Callibration__Group_2__0 : rule__Callibration__Group_2__0__Impl rule__Callibration__Group_2__1 ;
    public final void rule__Callibration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4657:1: ( rule__Callibration__Group_2__0__Impl rule__Callibration__Group_2__1 )
            // InternalDsl.g:4658:2: rule__Callibration__Group_2__0__Impl rule__Callibration__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Callibration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Callibration__Group_2__1();

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
    // $ANTLR end "rule__Callibration__Group_2__0"


    // $ANTLR start "rule__Callibration__Group_2__0__Impl"
    // InternalDsl.g:4665:1: rule__Callibration__Group_2__0__Impl : ( 'Falling' ) ;
    public final void rule__Callibration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4669:1: ( ( 'Falling' ) )
            // InternalDsl.g:4670:1: ( 'Falling' )
            {
            // InternalDsl.g:4670:1: ( 'Falling' )
            // InternalDsl.g:4671:2: 'Falling'
            {
             before(grammarAccess.getCallibrationAccess().getFallingKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCallibrationAccess().getFallingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group_2__0__Impl"


    // $ANTLR start "rule__Callibration__Group_2__1"
    // InternalDsl.g:4680:1: rule__Callibration__Group_2__1 : rule__Callibration__Group_2__1__Impl ;
    public final void rule__Callibration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4684:1: ( rule__Callibration__Group_2__1__Impl )
            // InternalDsl.g:4685:2: rule__Callibration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__Group_2__1__Impl();

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
    // $ANTLR end "rule__Callibration__Group_2__1"


    // $ANTLR start "rule__Callibration__Group_2__1__Impl"
    // InternalDsl.g:4691:1: rule__Callibration__Group_2__1__Impl : ( ( rule__Callibration__FallingAssignment_2_1 ) ) ;
    public final void rule__Callibration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4695:1: ( ( ( rule__Callibration__FallingAssignment_2_1 ) ) )
            // InternalDsl.g:4696:1: ( ( rule__Callibration__FallingAssignment_2_1 ) )
            {
            // InternalDsl.g:4696:1: ( ( rule__Callibration__FallingAssignment_2_1 ) )
            // InternalDsl.g:4697:2: ( rule__Callibration__FallingAssignment_2_1 )
            {
             before(grammarAccess.getCallibrationAccess().getFallingAssignment_2_1()); 
            // InternalDsl.g:4698:2: ( rule__Callibration__FallingAssignment_2_1 )
            // InternalDsl.g:4698:3: rule__Callibration__FallingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Callibration__FallingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCallibrationAccess().getFallingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__Group_2__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalDsl.g:4707:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4711:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalDsl.g:4712:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDsl.g:4719:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4723:1: ( ( () ) )
            // InternalDsl.g:4724:1: ( () )
            {
            // InternalDsl.g:4724:1: ( () )
            // InternalDsl.g:4725:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalDsl.g:4726:2: ()
            // InternalDsl.g:4726:3: 
            {
            }

             after(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalDsl.g:4734:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4738:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalDsl.g:4739:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDsl.g:4746:1: rule__Dynamics__Group__1__Impl : ( ( rule__Dynamics__Group_1__0 )? ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4750:1: ( ( ( rule__Dynamics__Group_1__0 )? ) )
            // InternalDsl.g:4751:1: ( ( rule__Dynamics__Group_1__0 )? )
            {
            // InternalDsl.g:4751:1: ( ( rule__Dynamics__Group_1__0 )? )
            // InternalDsl.g:4752:2: ( rule__Dynamics__Group_1__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_1()); 
            // InternalDsl.g:4753:2: ( rule__Dynamics__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:4753:3: rule__Dynamics__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:4761:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4765:1: ( rule__Dynamics__Group__2__Impl )
            // InternalDsl.g:4766:2: rule__Dynamics__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2__Impl();

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
    // InternalDsl.g:4772:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__Group_2__0 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4776:1: ( ( ( rule__Dynamics__Group_2__0 )? ) )
            // InternalDsl.g:4777:1: ( ( rule__Dynamics__Group_2__0 )? )
            {
            // InternalDsl.g:4777:1: ( ( rule__Dynamics__Group_2__0 )? )
            // InternalDsl.g:4778:2: ( rule__Dynamics__Group_2__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_2()); 
            // InternalDsl.g:4779:2: ( rule__Dynamics__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==59) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:4779:3: rule__Dynamics__Group_2__0
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


    // $ANTLR start "rule__Dynamics__Group_1__0"
    // InternalDsl.g:4788:1: rule__Dynamics__Group_1__0 : rule__Dynamics__Group_1__0__Impl rule__Dynamics__Group_1__1 ;
    public final void rule__Dynamics__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4792:1: ( rule__Dynamics__Group_1__0__Impl rule__Dynamics__Group_1__1 )
            // InternalDsl.g:4793:2: rule__Dynamics__Group_1__0__Impl rule__Dynamics__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Dynamics__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_1__1();

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
    // $ANTLR end "rule__Dynamics__Group_1__0"


    // $ANTLR start "rule__Dynamics__Group_1__0__Impl"
    // InternalDsl.g:4800:1: rule__Dynamics__Group_1__0__Impl : ( 'Friction' ) ;
    public final void rule__Dynamics__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4804:1: ( ( 'Friction' ) )
            // InternalDsl.g:4805:1: ( 'Friction' )
            {
            // InternalDsl.g:4805:1: ( 'Friction' )
            // InternalDsl.g:4806:2: 'Friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_1__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_1__1"
    // InternalDsl.g:4815:1: rule__Dynamics__Group_1__1 : rule__Dynamics__Group_1__1__Impl ;
    public final void rule__Dynamics__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4819:1: ( rule__Dynamics__Group_1__1__Impl )
            // InternalDsl.g:4820:2: rule__Dynamics__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_1__1__Impl();

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
    // $ANTLR end "rule__Dynamics__Group_1__1"


    // $ANTLR start "rule__Dynamics__Group_1__1__Impl"
    // InternalDsl.g:4826:1: rule__Dynamics__Group_1__1__Impl : ( ( rule__Dynamics__FrictionAssignment_1_1 ) ) ;
    public final void rule__Dynamics__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4830:1: ( ( ( rule__Dynamics__FrictionAssignment_1_1 ) ) )
            // InternalDsl.g:4831:1: ( ( rule__Dynamics__FrictionAssignment_1_1 ) )
            {
            // InternalDsl.g:4831:1: ( ( rule__Dynamics__FrictionAssignment_1_1 ) )
            // InternalDsl.g:4832:2: ( rule__Dynamics__FrictionAssignment_1_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_1_1()); 
            // InternalDsl.g:4833:2: ( rule__Dynamics__FrictionAssignment_1_1 )
            // InternalDsl.g:4833:3: rule__Dynamics__FrictionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_1__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__0"
    // InternalDsl.g:4842:1: rule__Dynamics__Group_2__0 : rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 ;
    public final void rule__Dynamics__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4846:1: ( rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 )
            // InternalDsl.g:4847:2: rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:4854:1: rule__Dynamics__Group_2__0__Impl : ( 'Damping' ) ;
    public final void rule__Dynamics__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4858:1: ( ( 'Damping' ) )
            // InternalDsl.g:4859:1: ( 'Damping' )
            {
            // InternalDsl.g:4859:1: ( 'Damping' )
            // InternalDsl.g:4860:2: 'Damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_2_0()); 

            }


            }

        }
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
    // InternalDsl.g:4869:1: rule__Dynamics__Group_2__1 : rule__Dynamics__Group_2__1__Impl ;
    public final void rule__Dynamics__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4873:1: ( rule__Dynamics__Group_2__1__Impl )
            // InternalDsl.g:4874:2: rule__Dynamics__Group_2__1__Impl
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
    // InternalDsl.g:4880:1: rule__Dynamics__Group_2__1__Impl : ( ( rule__Dynamics__DampingAssignment_2_1 ) ) ;
    public final void rule__Dynamics__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4884:1: ( ( ( rule__Dynamics__DampingAssignment_2_1 ) ) )
            // InternalDsl.g:4885:1: ( ( rule__Dynamics__DampingAssignment_2_1 ) )
            {
            // InternalDsl.g:4885:1: ( ( rule__Dynamics__DampingAssignment_2_1 ) )
            // InternalDsl.g:4886:2: ( rule__Dynamics__DampingAssignment_2_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_2_1()); 
            // InternalDsl.g:4887:2: ( rule__Dynamics__DampingAssignment_2_1 )
            // InternalDsl.g:4887:3: rule__Dynamics__DampingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mimic__Group__0"
    // InternalDsl.g:4896:1: rule__Mimic__Group__0 : rule__Mimic__Group__0__Impl rule__Mimic__Group__1 ;
    public final void rule__Mimic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4900:1: ( rule__Mimic__Group__0__Impl rule__Mimic__Group__1 )
            // InternalDsl.g:4901:2: rule__Mimic__Group__0__Impl rule__Mimic__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:4908:1: rule__Mimic__Group__0__Impl : ( () ) ;
    public final void rule__Mimic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4912:1: ( ( () ) )
            // InternalDsl.g:4913:1: ( () )
            {
            // InternalDsl.g:4913:1: ( () )
            // InternalDsl.g:4914:2: ()
            {
             before(grammarAccess.getMimicAccess().getMimicAction_0()); 
            // InternalDsl.g:4915:2: ()
            // InternalDsl.g:4915:3: 
            {
            }

             after(grammarAccess.getMimicAccess().getMimicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0__Impl"


    // $ANTLR start "rule__Mimic__Group__1"
    // InternalDsl.g:4923:1: rule__Mimic__Group__1 : rule__Mimic__Group__1__Impl rule__Mimic__Group__2 ;
    public final void rule__Mimic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4927:1: ( rule__Mimic__Group__1__Impl rule__Mimic__Group__2 )
            // InternalDsl.g:4928:2: rule__Mimic__Group__1__Impl rule__Mimic__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:4935:1: rule__Mimic__Group__1__Impl : ( ( rule__Mimic__Group_1__0 )? ) ;
    public final void rule__Mimic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4939:1: ( ( ( rule__Mimic__Group_1__0 )? ) )
            // InternalDsl.g:4940:1: ( ( rule__Mimic__Group_1__0 )? )
            {
            // InternalDsl.g:4940:1: ( ( rule__Mimic__Group_1__0 )? )
            // InternalDsl.g:4941:2: ( rule__Mimic__Group_1__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_1()); 
            // InternalDsl.g:4942:2: ( rule__Mimic__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_STRING) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:4942:3: rule__Mimic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:4950:1: rule__Mimic__Group__2 : rule__Mimic__Group__2__Impl rule__Mimic__Group__3 ;
    public final void rule__Mimic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4954:1: ( rule__Mimic__Group__2__Impl rule__Mimic__Group__3 )
            // InternalDsl.g:4955:2: rule__Mimic__Group__2__Impl rule__Mimic__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:4962:1: rule__Mimic__Group__2__Impl : ( ( rule__Mimic__Group_2__0 )? ) ;
    public final void rule__Mimic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4966:1: ( ( ( rule__Mimic__Group_2__0 )? ) )
            // InternalDsl.g:4967:1: ( ( rule__Mimic__Group_2__0 )? )
            {
            // InternalDsl.g:4967:1: ( ( rule__Mimic__Group_2__0 )? )
            // InternalDsl.g:4968:2: ( rule__Mimic__Group_2__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_2()); 
            // InternalDsl.g:4969:2: ( rule__Mimic__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:4969:3: rule__Mimic__Group_2__0
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
    // InternalDsl.g:4977:1: rule__Mimic__Group__3 : rule__Mimic__Group__3__Impl ;
    public final void rule__Mimic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4981:1: ( rule__Mimic__Group__3__Impl )
            // InternalDsl.g:4982:2: rule__Mimic__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3__Impl();

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
    // InternalDsl.g:4988:1: rule__Mimic__Group__3__Impl : ( ( rule__Mimic__Group_3__0 )? ) ;
    public final void rule__Mimic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4992:1: ( ( ( rule__Mimic__Group_3__0 )? ) )
            // InternalDsl.g:4993:1: ( ( rule__Mimic__Group_3__0 )? )
            {
            // InternalDsl.g:4993:1: ( ( rule__Mimic__Group_3__0 )? )
            // InternalDsl.g:4994:2: ( rule__Mimic__Group_3__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_3()); 
            // InternalDsl.g:4995:2: ( rule__Mimic__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:4995:3: rule__Mimic__Group_3__0
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


    // $ANTLR start "rule__Mimic__Group_1__0"
    // InternalDsl.g:5004:1: rule__Mimic__Group_1__0 : rule__Mimic__Group_1__0__Impl rule__Mimic__Group_1__1 ;
    public final void rule__Mimic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5008:1: ( rule__Mimic__Group_1__0__Impl rule__Mimic__Group_1__1 )
            // InternalDsl.g:5009:2: rule__Mimic__Group_1__0__Impl rule__Mimic__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Mimic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_1__1();

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
    // $ANTLR end "rule__Mimic__Group_1__0"


    // $ANTLR start "rule__Mimic__Group_1__0__Impl"
    // InternalDsl.g:5016:1: rule__Mimic__Group_1__0__Impl : ( 'Joint' ) ;
    public final void rule__Mimic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5020:1: ( ( 'Joint' ) )
            // InternalDsl.g:5021:1: ( 'Joint' )
            {
            // InternalDsl.g:5021:1: ( 'Joint' )
            // InternalDsl.g:5022:2: 'Joint'
            {
             before(grammarAccess.getMimicAccess().getJointKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getJointKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_1__0__Impl"


    // $ANTLR start "rule__Mimic__Group_1__1"
    // InternalDsl.g:5031:1: rule__Mimic__Group_1__1 : rule__Mimic__Group_1__1__Impl ;
    public final void rule__Mimic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5035:1: ( rule__Mimic__Group_1__1__Impl )
            // InternalDsl.g:5036:2: rule__Mimic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Mimic__Group_1__1"


    // $ANTLR start "rule__Mimic__Group_1__1__Impl"
    // InternalDsl.g:5042:1: rule__Mimic__Group_1__1__Impl : ( ( rule__Mimic__JointAssignment_1_1 ) ) ;
    public final void rule__Mimic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5046:1: ( ( ( rule__Mimic__JointAssignment_1_1 ) ) )
            // InternalDsl.g:5047:1: ( ( rule__Mimic__JointAssignment_1_1 ) )
            {
            // InternalDsl.g:5047:1: ( ( rule__Mimic__JointAssignment_1_1 ) )
            // InternalDsl.g:5048:2: ( rule__Mimic__JointAssignment_1_1 )
            {
             before(grammarAccess.getMimicAccess().getJointAssignment_1_1()); 
            // InternalDsl.g:5049:2: ( rule__Mimic__JointAssignment_1_1 )
            // InternalDsl.g:5049:3: rule__Mimic__JointAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__JointAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getJointAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_1__1__Impl"


    // $ANTLR start "rule__Mimic__Group_2__0"
    // InternalDsl.g:5058:1: rule__Mimic__Group_2__0 : rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 ;
    public final void rule__Mimic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5062:1: ( rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1 )
            // InternalDsl.g:5063:2: rule__Mimic__Group_2__0__Impl rule__Mimic__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:5070:1: rule__Mimic__Group_2__0__Impl : ( 'Multiplier' ) ;
    public final void rule__Mimic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5074:1: ( ( 'Multiplier' ) )
            // InternalDsl.g:5075:1: ( 'Multiplier' )
            {
            // InternalDsl.g:5075:1: ( 'Multiplier' )
            // InternalDsl.g:5076:2: 'Multiplier'
            {
             before(grammarAccess.getMimicAccess().getMultiplierKeyword_2_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalDsl.g:5085:1: rule__Mimic__Group_2__1 : rule__Mimic__Group_2__1__Impl ;
    public final void rule__Mimic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5089:1: ( rule__Mimic__Group_2__1__Impl )
            // InternalDsl.g:5090:2: rule__Mimic__Group_2__1__Impl
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
    // InternalDsl.g:5096:1: rule__Mimic__Group_2__1__Impl : ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) ;
    public final void rule__Mimic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5100:1: ( ( ( rule__Mimic__MultiplierAssignment_2_1 ) ) )
            // InternalDsl.g:5101:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            {
            // InternalDsl.g:5101:1: ( ( rule__Mimic__MultiplierAssignment_2_1 ) )
            // InternalDsl.g:5102:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            {
             before(grammarAccess.getMimicAccess().getMultiplierAssignment_2_1()); 
            // InternalDsl.g:5103:2: ( rule__Mimic__MultiplierAssignment_2_1 )
            // InternalDsl.g:5103:3: rule__Mimic__MultiplierAssignment_2_1
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
    // InternalDsl.g:5112:1: rule__Mimic__Group_3__0 : rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 ;
    public final void rule__Mimic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5116:1: ( rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 )
            // InternalDsl.g:5117:2: rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:5124:1: rule__Mimic__Group_3__0__Impl : ( 'OffSet' ) ;
    public final void rule__Mimic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5128:1: ( ( 'OffSet' ) )
            // InternalDsl.g:5129:1: ( 'OffSet' )
            {
            // InternalDsl.g:5129:1: ( 'OffSet' )
            // InternalDsl.g:5130:2: 'OffSet'
            {
             before(grammarAccess.getMimicAccess().getOffSetKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalDsl.g:5139:1: rule__Mimic__Group_3__1 : rule__Mimic__Group_3__1__Impl ;
    public final void rule__Mimic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5143:1: ( rule__Mimic__Group_3__1__Impl )
            // InternalDsl.g:5144:2: rule__Mimic__Group_3__1__Impl
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
    // InternalDsl.g:5150:1: rule__Mimic__Group_3__1__Impl : ( ( rule__Mimic__OffSetAssignment_3_1 ) ) ;
    public final void rule__Mimic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5154:1: ( ( ( rule__Mimic__OffSetAssignment_3_1 ) ) )
            // InternalDsl.g:5155:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            {
            // InternalDsl.g:5155:1: ( ( rule__Mimic__OffSetAssignment_3_1 ) )
            // InternalDsl.g:5156:2: ( rule__Mimic__OffSetAssignment_3_1 )
            {
             before(grammarAccess.getMimicAccess().getOffSetAssignment_3_1()); 
            // InternalDsl.g:5157:2: ( rule__Mimic__OffSetAssignment_3_1 )
            // InternalDsl.g:5157:3: rule__Mimic__OffSetAssignment_3_1
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


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalDsl.g:5166:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5170:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalDsl.g:5171:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:5178:1: rule__SafetyController__Group__0__Impl : ( () ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5182:1: ( ( () ) )
            // InternalDsl.g:5183:1: ( () )
            {
            // InternalDsl.g:5183:1: ( () )
            // InternalDsl.g:5184:2: ()
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0()); 
            // InternalDsl.g:5185:2: ()
            // InternalDsl.g:5185:3: 
            {
            }

             after(grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalDsl.g:5193:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5197:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalDsl.g:5198:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:5205:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__Group_1__0 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5209:1: ( ( ( rule__SafetyController__Group_1__0 )? ) )
            // InternalDsl.g:5210:1: ( ( rule__SafetyController__Group_1__0 )? )
            {
            // InternalDsl.g:5210:1: ( ( rule__SafetyController__Group_1__0 )? )
            // InternalDsl.g:5211:2: ( rule__SafetyController__Group_1__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_1()); 
            // InternalDsl.g:5212:2: ( rule__SafetyController__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:5212:3: rule__SafetyController__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDsl.g:5220:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5224:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalDsl.g:5225:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:5232:1: rule__SafetyController__Group__2__Impl : ( ( rule__SafetyController__Group_2__0 )? ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5236:1: ( ( ( rule__SafetyController__Group_2__0 )? ) )
            // InternalDsl.g:5237:1: ( ( rule__SafetyController__Group_2__0 )? )
            {
            // InternalDsl.g:5237:1: ( ( rule__SafetyController__Group_2__0 )? )
            // InternalDsl.g:5238:2: ( rule__SafetyController__Group_2__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_2()); 
            // InternalDsl.g:5239:2: ( rule__SafetyController__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:5239:3: rule__SafetyController__Group_2__0
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
    // InternalDsl.g:5247:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5251:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalDsl.g:5252:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:5259:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__Group_3__0 )? ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5263:1: ( ( ( rule__SafetyController__Group_3__0 )? ) )
            // InternalDsl.g:5264:1: ( ( rule__SafetyController__Group_3__0 )? )
            {
            // InternalDsl.g:5264:1: ( ( rule__SafetyController__Group_3__0 )? )
            // InternalDsl.g:5265:2: ( rule__SafetyController__Group_3__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_3()); 
            // InternalDsl.g:5266:2: ( rule__SafetyController__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==64) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:5266:3: rule__SafetyController__Group_3__0
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
    // InternalDsl.g:5274:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5278:1: ( rule__SafetyController__Group__4__Impl )
            // InternalDsl.g:5279:2: rule__SafetyController__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4__Impl();

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
    // InternalDsl.g:5285:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5289:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalDsl.g:5290:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalDsl.g:5290:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalDsl.g:5291:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalDsl.g:5292:2: ( rule__SafetyController__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:5292:3: rule__SafetyController__Group_4__0
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


    // $ANTLR start "rule__SafetyController__Group_1__0"
    // InternalDsl.g:5301:1: rule__SafetyController__Group_1__0 : rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 ;
    public final void rule__SafetyController__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5305:1: ( rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 )
            // InternalDsl.g:5306:2: rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__SafetyController__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1();

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
    // $ANTLR end "rule__SafetyController__Group_1__0"


    // $ANTLR start "rule__SafetyController__Group_1__0__Impl"
    // InternalDsl.g:5313:1: rule__SafetyController__Group_1__0__Impl : ( 'SoftLowerLimit' ) ;
    public final void rule__SafetyController__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5317:1: ( ( 'SoftLowerLimit' ) )
            // InternalDsl.g:5318:1: ( 'SoftLowerLimit' )
            {
            // InternalDsl.g:5318:1: ( 'SoftLowerLimit' )
            // InternalDsl.g:5319:2: 'SoftLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_1__1"
    // InternalDsl.g:5328:1: rule__SafetyController__Group_1__1 : rule__SafetyController__Group_1__1__Impl ;
    public final void rule__SafetyController__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5332:1: ( rule__SafetyController__Group_1__1__Impl )
            // InternalDsl.g:5333:2: rule__SafetyController__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1__Impl();

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
    // $ANTLR end "rule__SafetyController__Group_1__1"


    // $ANTLR start "rule__SafetyController__Group_1__1__Impl"
    // InternalDsl.g:5339:1: rule__SafetyController__Group_1__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) ;
    public final void rule__SafetyController__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5343:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) )
            // InternalDsl.g:5344:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            {
            // InternalDsl.g:5344:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            // InternalDsl.g:5345:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 
            // InternalDsl.g:5346:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            // InternalDsl.g:5346:3: rule__SafetyController__SoftLowerLimitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__0"
    // InternalDsl.g:5355:1: rule__SafetyController__Group_2__0 : rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 ;
    public final void rule__SafetyController__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5359:1: ( rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 )
            // InternalDsl.g:5360:2: rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:5367:1: rule__SafetyController__Group_2__0__Impl : ( 'SoftUpperLimit' ) ;
    public final void rule__SafetyController__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5371:1: ( ( 'SoftUpperLimit' ) )
            // InternalDsl.g:5372:1: ( 'SoftUpperLimit' )
            {
            // InternalDsl.g:5372:1: ( 'SoftUpperLimit' )
            // InternalDsl.g:5373:2: 'SoftUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 

            }


            }

        }
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
    // InternalDsl.g:5382:1: rule__SafetyController__Group_2__1 : rule__SafetyController__Group_2__1__Impl ;
    public final void rule__SafetyController__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5386:1: ( rule__SafetyController__Group_2__1__Impl )
            // InternalDsl.g:5387:2: rule__SafetyController__Group_2__1__Impl
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
    // InternalDsl.g:5393:1: rule__SafetyController__Group_2__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) ;
    public final void rule__SafetyController__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5397:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) )
            // InternalDsl.g:5398:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            {
            // InternalDsl.g:5398:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            // InternalDsl.g:5399:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 
            // InternalDsl.g:5400:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            // InternalDsl.g:5400:3: rule__SafetyController__SoftUpperLimitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 

            }


            }

        }
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
    // InternalDsl.g:5409:1: rule__SafetyController__Group_3__0 : rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 ;
    public final void rule__SafetyController__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5413:1: ( rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 )
            // InternalDsl.g:5414:2: rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:5421:1: rule__SafetyController__Group_3__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5425:1: ( ( 'k_position' ) )
            // InternalDsl.g:5426:1: ( 'k_position' )
            {
            // InternalDsl.g:5426:1: ( 'k_position' )
            // InternalDsl.g:5427:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 

            }


            }

        }
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
    // InternalDsl.g:5436:1: rule__SafetyController__Group_3__1 : rule__SafetyController__Group_3__1__Impl ;
    public final void rule__SafetyController__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5440:1: ( rule__SafetyController__Group_3__1__Impl )
            // InternalDsl.g:5441:2: rule__SafetyController__Group_3__1__Impl
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
    // InternalDsl.g:5447:1: rule__SafetyController__Group_3__1__Impl : ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) ;
    public final void rule__SafetyController__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5451:1: ( ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) )
            // InternalDsl.g:5452:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            {
            // InternalDsl.g:5452:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            // InternalDsl.g:5453:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 
            // InternalDsl.g:5454:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            // InternalDsl.g:5454:3: rule__SafetyController__K_positionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 

            }


            }

        }
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
    // InternalDsl.g:5463:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5467:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalDsl.g:5468:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDsl.g:5475:1: rule__SafetyController__Group_4__0__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5479:1: ( ( 'k_velocity' ) )
            // InternalDsl.g:5480:1: ( 'k_velocity' )
            {
            // InternalDsl.g:5480:1: ( 'k_velocity' )
            // InternalDsl.g:5481:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4_0()); 

            }


            }

        }
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
    // InternalDsl.g:5490:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5494:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalDsl.g:5495:2: rule__SafetyController__Group_4__1__Impl
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
    // InternalDsl.g:5501:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_velocityAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5505:1: ( ( ( rule__SafetyController__K_velocityAssignment_4_1 ) ) )
            // InternalDsl.g:5506:1: ( ( rule__SafetyController__K_velocityAssignment_4_1 ) )
            {
            // InternalDsl.g:5506:1: ( ( rule__SafetyController__K_velocityAssignment_4_1 ) )
            // InternalDsl.g:5507:2: ( rule__SafetyController__K_velocityAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_4_1()); 
            // InternalDsl.g:5508:2: ( rule__SafetyController__K_velocityAssignment_4_1 )
            // InternalDsl.g:5508:3: rule__SafetyController__K_velocityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalDsl.g:5517:1: rule__Robot__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5521:1: ( ( RULE_STRING ) )
            // InternalDsl.g:5522:2: ( RULE_STRING )
            {
            // InternalDsl.g:5522:2: ( RULE_STRING )
            // InternalDsl.g:5523:3: RULE_STRING
            {
             before(grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalDsl.g:5532:1: rule__Robot__LinkAssignment_2 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5536:1: ( ( ruleLink ) )
            // InternalDsl.g:5537:2: ( ruleLink )
            {
            // InternalDsl.g:5537:2: ( ruleLink )
            // InternalDsl.g:5538:3: ruleLink
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


    // $ANTLR start "rule__Robot__LinkAssignment_3_1"
    // InternalDsl.g:5547:1: rule__Robot__LinkAssignment_3_1 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5551:1: ( ( ruleLink ) )
            // InternalDsl.g:5552:2: ( ruleLink )
            {
            // InternalDsl.g:5552:2: ( ruleLink )
            // InternalDsl.g:5553:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_3_1"


    // $ANTLR start "rule__Robot__JointAssignment_4_0"
    // InternalDsl.g:5562:1: rule__Robot__JointAssignment_4_0 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5566:1: ( ( ruleJoint ) )
            // InternalDsl.g:5567:2: ( ruleJoint )
            {
            // InternalDsl.g:5567:2: ( ruleJoint )
            // InternalDsl.g:5568:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_4_0"


    // $ANTLR start "rule__Robot__JointAssignment_4_1"
    // InternalDsl.g:5577:1: rule__Robot__JointAssignment_4_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5581:1: ( ( ruleJoint ) )
            // InternalDsl.g:5582:2: ( ruleJoint )
            {
            // InternalDsl.g:5582:2: ( ruleJoint )
            // InternalDsl.g:5583:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_4_1"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalDsl.g:5592:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5596:1: ( ( RULE_ID ) )
            // InternalDsl.g:5597:2: ( RULE_ID )
            {
            // InternalDsl.g:5597:2: ( RULE_ID )
            // InternalDsl.g:5598:3: RULE_ID
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


    // $ANTLR start "rule__Link__InertialAssignment_3_1"
    // InternalDsl.g:5607:1: rule__Link__InertialAssignment_3_1 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5611:1: ( ( ruleInertial ) )
            // InternalDsl.g:5612:2: ( ruleInertial )
            {
            // InternalDsl.g:5612:2: ( ruleInertial )
            // InternalDsl.g:5613:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3_1"


    // $ANTLR start "rule__Link__InertialAssignment_3_2"
    // InternalDsl.g:5622:1: rule__Link__InertialAssignment_3_2 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5626:1: ( ( ruleInertial ) )
            // InternalDsl.g:5627:2: ( ruleInertial )
            {
            // InternalDsl.g:5627:2: ( ruleInertial )
            // InternalDsl.g:5628:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3_2"


    // $ANTLR start "rule__Link__VisualsAssignment_4_1"
    // InternalDsl.g:5637:1: rule__Link__VisualsAssignment_4_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5641:1: ( ( ruleVisual ) )
            // InternalDsl.g:5642:2: ( ruleVisual )
            {
            // InternalDsl.g:5642:2: ( ruleVisual )
            // InternalDsl.g:5643:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_4_1"


    // $ANTLR start "rule__Link__VisualsAssignment_4_2"
    // InternalDsl.g:5652:1: rule__Link__VisualsAssignment_4_2 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5656:1: ( ( ruleVisual ) )
            // InternalDsl.g:5657:2: ( ruleVisual )
            {
            // InternalDsl.g:5657:2: ( ruleVisual )
            // InternalDsl.g:5658:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_4_2"


    // $ANTLR start "rule__Link__CollisionAssignment_5_1"
    // InternalDsl.g:5667:1: rule__Link__CollisionAssignment_5_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5671:1: ( ( ruleCollision ) )
            // InternalDsl.g:5672:2: ( ruleCollision )
            {
            // InternalDsl.g:5672:2: ( ruleCollision )
            // InternalDsl.g:5673:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_5_1"


    // $ANTLR start "rule__Link__CollisionAssignment_5_2"
    // InternalDsl.g:5682:1: rule__Link__CollisionAssignment_5_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5686:1: ( ( ruleCollision ) )
            // InternalDsl.g:5687:2: ( ruleCollision )
            {
            // InternalDsl.g:5687:2: ( ruleCollision )
            // InternalDsl.g:5688:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_5_2"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalDsl.g:5697:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5701:1: ( ( RULE_ID ) )
            // InternalDsl.g:5702:2: ( RULE_ID )
            {
            // InternalDsl.g:5702:2: ( RULE_ID )
            // InternalDsl.g:5703:3: RULE_ID
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


    // $ANTLR start "rule__Joint__TypeAssignment_2_1"
    // InternalDsl.g:5712:1: rule__Joint__TypeAssignment_2_1 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5716:1: ( ( ruleJointType ) )
            // InternalDsl.g:5717:2: ( ruleJointType )
            {
            // InternalDsl.g:5717:2: ( ruleJointType )
            // InternalDsl.g:5718:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_2_1"


    // $ANTLR start "rule__Joint__ChildOfAssignment_4"
    // InternalDsl.g:5727:1: rule__Joint__ChildOfAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ChildOfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5731:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:5732:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:5732:2: ( ( RULE_STRING ) )
            // InternalDsl.g:5733:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0()); 
            // InternalDsl.g:5734:3: ( RULE_STRING )
            // InternalDsl.g:5735:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_4"


    // $ANTLR start "rule__Joint__ParentOfAssignment_6"
    // InternalDsl.g:5746:1: rule__Joint__ParentOfAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__Joint__ParentOfAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5750:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:5751:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:5751:2: ( ( RULE_STRING ) )
            // InternalDsl.g:5752:3: ( RULE_STRING )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0()); 
            // InternalDsl.g:5753:3: ( RULE_STRING )
            // InternalDsl.g:5754:4: RULE_STRING
            {
             before(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_6"


    // $ANTLR start "rule__Joint__LimitAssignment_7_1"
    // InternalDsl.g:5765:1: rule__Joint__LimitAssignment_7_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5769:1: ( ( ruleLimit ) )
            // InternalDsl.g:5770:2: ( ruleLimit )
            {
            // InternalDsl.g:5770:2: ( ruleLimit )
            // InternalDsl.g:5771:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_7_1"


    // $ANTLR start "rule__Joint__AxisAssignment_8_1"
    // InternalDsl.g:5780:1: rule__Joint__AxisAssignment_8_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5784:1: ( ( ruleAxis ) )
            // InternalDsl.g:5785:2: ( ruleAxis )
            {
            // InternalDsl.g:5785:2: ( ruleAxis )
            // InternalDsl.g:5786:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_8_1"


    // $ANTLR start "rule__Joint__OriginAssignment_10"
    // InternalDsl.g:5795:1: rule__Joint__OriginAssignment_10 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5799:1: ( ( ruleOrigin ) )
            // InternalDsl.g:5800:2: ( ruleOrigin )
            {
            // InternalDsl.g:5800:2: ( ruleOrigin )
            // InternalDsl.g:5801:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_10"


    // $ANTLR start "rule__Joint__CallibrationAssignment_11_1"
    // InternalDsl.g:5810:1: rule__Joint__CallibrationAssignment_11_1 : ( ruleCallibration ) ;
    public final void rule__Joint__CallibrationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5814:1: ( ( ruleCallibration ) )
            // InternalDsl.g:5815:2: ( ruleCallibration )
            {
            // InternalDsl.g:5815:2: ( ruleCallibration )
            // InternalDsl.g:5816:3: ruleCallibration
            {
             before(grammarAccess.getJointAccess().getCallibrationCallibrationParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCallibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCallibrationCallibrationParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__CallibrationAssignment_11_1"


    // $ANTLR start "rule__Joint__DynamicsAssignment_12_1"
    // InternalDsl.g:5825:1: rule__Joint__DynamicsAssignment_12_1 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5829:1: ( ( ruleDynamics ) )
            // InternalDsl.g:5830:2: ( ruleDynamics )
            {
            // InternalDsl.g:5830:2: ( ruleDynamics )
            // InternalDsl.g:5831:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DynamicsAssignment_12_1"


    // $ANTLR start "rule__Joint__MimicAssignment_13_1"
    // InternalDsl.g:5840:1: rule__Joint__MimicAssignment_13_1 : ( ruleMimic ) ;
    public final void rule__Joint__MimicAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5844:1: ( ( ruleMimic ) )
            // InternalDsl.g:5845:2: ( ruleMimic )
            {
            // InternalDsl.g:5845:2: ( ruleMimic )
            // InternalDsl.g:5846:3: ruleMimic
            {
             before(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__MimicAssignment_13_1"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_14_1"
    // InternalDsl.g:5855:1: rule__Joint__SafetycontrollerAssignment_14_1 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5859:1: ( ( ruleSafetyController ) )
            // InternalDsl.g:5860:2: ( ruleSafetyController )
            {
            // InternalDsl.g:5860:2: ( ruleSafetyController )
            // InternalDsl.g:5861:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_14_1"


    // $ANTLR start "rule__Inertial__OriginAssignment_1"
    // InternalDsl.g:5870:1: rule__Inertial__OriginAssignment_1 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5874:1: ( ( ruleOrigin ) )
            // InternalDsl.g:5875:2: ( ruleOrigin )
            {
            // InternalDsl.g:5875:2: ( ruleOrigin )
            // InternalDsl.g:5876:3: ruleOrigin
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


    // $ANTLR start "rule__Inertial__MassAssignment_2_1"
    // InternalDsl.g:5885:1: rule__Inertial__MassAssignment_2_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5889:1: ( ( ruleMass ) )
            // InternalDsl.g:5890:2: ( ruleMass )
            {
            // InternalDsl.g:5890:2: ( ruleMass )
            // InternalDsl.g:5891:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_2_1"


    // $ANTLR start "rule__Inertial__MassAssignment_2_2_1"
    // InternalDsl.g:5900:1: rule__Inertial__MassAssignment_2_2_1 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5904:1: ( ( ruleMass ) )
            // InternalDsl.g:5905:2: ( ruleMass )
            {
            // InternalDsl.g:5905:2: ( ruleMass )
            // InternalDsl.g:5906:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_2_2_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_3_1"
    // InternalDsl.g:5915:1: rule__Inertial__InertiaAssignment_3_1 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5919:1: ( ( ruleInertia ) )
            // InternalDsl.g:5920:2: ( ruleInertia )
            {
            // InternalDsl.g:5920:2: ( ruleInertia )
            // InternalDsl.g:5921:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_3_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_3_2"
    // InternalDsl.g:5930:1: rule__Inertial__InertiaAssignment_3_2 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5934:1: ( ( ruleInertia ) )
            // InternalDsl.g:5935:2: ( ruleInertia )
            {
            // InternalDsl.g:5935:2: ( ruleInertia )
            // InternalDsl.g:5936:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_3_2"


    // $ANTLR start "rule__Visual__MaterialAssignment_0_1"
    // InternalDsl.g:5945:1: rule__Visual__MaterialAssignment_0_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5949:1: ( ( ruleMaterial ) )
            // InternalDsl.g:5950:2: ( ruleMaterial )
            {
            // InternalDsl.g:5950:2: ( ruleMaterial )
            // InternalDsl.g:5951:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__MaterialAssignment_0_1"


    // $ANTLR start "rule__Visual__OriginAssignment_2"
    // InternalDsl.g:5960:1: rule__Visual__OriginAssignment_2 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5964:1: ( ( ruleOrigin ) )
            // InternalDsl.g:5965:2: ( ruleOrigin )
            {
            // InternalDsl.g:5965:2: ( ruleOrigin )
            // InternalDsl.g:5966:3: ruleOrigin
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


    // $ANTLR start "rule__Visual__GeometryAssignment_4"
    // InternalDsl.g:5975:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5979:1: ( ( ruleGeometry ) )
            // InternalDsl.g:5980:2: ( ruleGeometry )
            {
            // InternalDsl.g:5980:2: ( ruleGeometry )
            // InternalDsl.g:5981:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_4"


    // $ANTLR start "rule__Collision__GeometryAssignment_1"
    // InternalDsl.g:5990:1: rule__Collision__GeometryAssignment_1 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5994:1: ( ( ruleGeometry ) )
            // InternalDsl.g:5995:2: ( ruleGeometry )
            {
            // InternalDsl.g:5995:2: ( ruleGeometry )
            // InternalDsl.g:5996:3: ruleGeometry
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


    // $ANTLR start "rule__Collision__OriginAssignment_3"
    // InternalDsl.g:6005:1: rule__Collision__OriginAssignment_3 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6009:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6010:2: ( ruleOrigin )
            {
            // InternalDsl.g:6010:2: ( ruleOrigin )
            // InternalDsl.g:6011:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_3"


    // $ANTLR start "rule__Origin__XAssignment_1_1"
    // InternalDsl.g:6020:1: rule__Origin__XAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Origin__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6024:1: ( ( RULE_INT ) )
            // InternalDsl.g:6025:2: ( RULE_INT )
            {
            // InternalDsl.g:6025:2: ( RULE_INT )
            // InternalDsl.g:6026:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getXINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__XAssignment_1_1"


    // $ANTLR start "rule__Origin__YAssignment_2_1"
    // InternalDsl.g:6035:1: rule__Origin__YAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Origin__YAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6039:1: ( ( RULE_INT ) )
            // InternalDsl.g:6040:2: ( RULE_INT )
            {
            // InternalDsl.g:6040:2: ( RULE_INT )
            // InternalDsl.g:6041:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getYINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YAssignment_2_1"


    // $ANTLR start "rule__Origin__ZAssignment_3_1"
    // InternalDsl.g:6050:1: rule__Origin__ZAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Origin__ZAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6054:1: ( ( RULE_INT ) )
            // InternalDsl.g:6055:2: ( RULE_INT )
            {
            // InternalDsl.g:6055:2: ( RULE_INT )
            // InternalDsl.g:6056:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getZINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getZINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__ZAssignment_3_1"


    // $ANTLR start "rule__Origin__RollAssignment_4_1"
    // InternalDsl.g:6065:1: rule__Origin__RollAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Origin__RollAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6069:1: ( ( RULE_INT ) )
            // InternalDsl.g:6070:2: ( RULE_INT )
            {
            // InternalDsl.g:6070:2: ( RULE_INT )
            // InternalDsl.g:6071:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__RollAssignment_4_1"


    // $ANTLR start "rule__Origin__PitchAssignment_5_1"
    // InternalDsl.g:6080:1: rule__Origin__PitchAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Origin__PitchAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6084:1: ( ( RULE_INT ) )
            // InternalDsl.g:6085:2: ( RULE_INT )
            {
            // InternalDsl.g:6085:2: ( RULE_INT )
            // InternalDsl.g:6086:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__PitchAssignment_5_1"


    // $ANTLR start "rule__Origin__YawAssignment_6_1"
    // InternalDsl.g:6095:1: rule__Origin__YawAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Origin__YawAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6099:1: ( ( RULE_INT ) )
            // InternalDsl.g:6100:2: ( RULE_INT )
            {
            // InternalDsl.g:6100:2: ( RULE_INT )
            // InternalDsl.g:6101:3: RULE_INT
            {
             before(grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YawAssignment_6_1"


    // $ANTLR start "rule__Limit__LowerAssignment_1_1"
    // InternalDsl.g:6110:1: rule__Limit__LowerAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Limit__LowerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6114:1: ( ( RULE_INT ) )
            // InternalDsl.g:6115:2: ( RULE_INT )
            {
            // InternalDsl.g:6115:2: ( RULE_INT )
            // InternalDsl.g:6116:3: RULE_INT
            {
             before(grammarAccess.getLimitAccess().getLowerINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_1_1"


    // $ANTLR start "rule__Limit__UpperAssignment_2_1"
    // InternalDsl.g:6125:1: rule__Limit__UpperAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Limit__UpperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6129:1: ( ( RULE_INT ) )
            // InternalDsl.g:6130:2: ( RULE_INT )
            {
            // InternalDsl.g:6130:2: ( RULE_INT )
            // InternalDsl.g:6131:3: RULE_INT
            {
             before(grammarAccess.getLimitAccess().getUpperINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_2_1"


    // $ANTLR start "rule__Limit__EffortAssignment_3_1"
    // InternalDsl.g:6140:1: rule__Limit__EffortAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Limit__EffortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6144:1: ( ( RULE_INT ) )
            // InternalDsl.g:6145:2: ( RULE_INT )
            {
            // InternalDsl.g:6145:2: ( RULE_INT )
            // InternalDsl.g:6146:3: RULE_INT
            {
             before(grammarAccess.getLimitAccess().getEffortINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_3_1"


    // $ANTLR start "rule__Limit__VelocityAssignment_4_1"
    // InternalDsl.g:6155:1: rule__Limit__VelocityAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Limit__VelocityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6159:1: ( ( RULE_INT ) )
            // InternalDsl.g:6160:2: ( RULE_INT )
            {
            // InternalDsl.g:6160:2: ( RULE_INT )
            // InternalDsl.g:6161:3: RULE_INT
            {
             before(grammarAccess.getLimitAccess().getVelocityINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_4_1"


    // $ANTLR start "rule__Axis__XAssignment_1_1"
    // InternalDsl.g:6170:1: rule__Axis__XAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Axis__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6174:1: ( ( RULE_INT ) )
            // InternalDsl.g:6175:2: ( RULE_INT )
            {
            // InternalDsl.g:6175:2: ( RULE_INT )
            // InternalDsl.g:6176:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_1_1"


    // $ANTLR start "rule__Axis__YAssignment_2_1"
    // InternalDsl.g:6185:1: rule__Axis__YAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Axis__YAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6189:1: ( ( RULE_INT ) )
            // InternalDsl.g:6190:2: ( RULE_INT )
            {
            // InternalDsl.g:6190:2: ( RULE_INT )
            // InternalDsl.g:6191:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_2_1"


    // $ANTLR start "rule__Axis__ZAssignment_3_1"
    // InternalDsl.g:6200:1: rule__Axis__ZAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Axis__ZAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6204:1: ( ( RULE_INT ) )
            // InternalDsl.g:6205:2: ( RULE_INT )
            {
            // InternalDsl.g:6205:2: ( RULE_INT )
            // InternalDsl.g:6206:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_3_1"


    // $ANTLR start "rule__Callibration__RisingAssignment_1_1"
    // InternalDsl.g:6215:1: rule__Callibration__RisingAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Callibration__RisingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6219:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6220:2: ( RULE_STRING )
            {
            // InternalDsl.g:6220:2: ( RULE_STRING )
            // InternalDsl.g:6221:3: RULE_STRING
            {
             before(grammarAccess.getCallibrationAccess().getRisingSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCallibrationAccess().getRisingSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__RisingAssignment_1_1"


    // $ANTLR start "rule__Callibration__FallingAssignment_2_1"
    // InternalDsl.g:6230:1: rule__Callibration__FallingAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Callibration__FallingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6234:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6235:2: ( RULE_STRING )
            {
            // InternalDsl.g:6235:2: ( RULE_STRING )
            // InternalDsl.g:6236:3: RULE_STRING
            {
             before(grammarAccess.getCallibrationAccess().getFallingSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCallibrationAccess().getFallingSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callibration__FallingAssignment_2_1"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_1_1"
    // InternalDsl.g:6245:1: rule__Dynamics__FrictionAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Dynamics__FrictionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6249:1: ( ( RULE_INT ) )
            // InternalDsl.g:6250:2: ( RULE_INT )
            {
            // InternalDsl.g:6250:2: ( RULE_INT )
            // InternalDsl.g:6251:3: RULE_INT
            {
             before(grammarAccess.getDynamicsAccess().getFrictionINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_1_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_2_1"
    // InternalDsl.g:6260:1: rule__Dynamics__DampingAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Dynamics__DampingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6264:1: ( ( RULE_INT ) )
            // InternalDsl.g:6265:2: ( RULE_INT )
            {
            // InternalDsl.g:6265:2: ( RULE_INT )
            // InternalDsl.g:6266:3: RULE_INT
            {
             before(grammarAccess.getDynamicsAccess().getDampingINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_2_1"


    // $ANTLR start "rule__Mimic__JointAssignment_1_1"
    // InternalDsl.g:6275:1: rule__Mimic__JointAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Mimic__JointAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6279:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6280:2: ( RULE_STRING )
            {
            // InternalDsl.g:6280:2: ( RULE_STRING )
            // InternalDsl.g:6281:3: RULE_STRING
            {
             before(grammarAccess.getMimicAccess().getJointSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getJointSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__JointAssignment_1_1"


    // $ANTLR start "rule__Mimic__MultiplierAssignment_2_1"
    // InternalDsl.g:6290:1: rule__Mimic__MultiplierAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Mimic__MultiplierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6294:1: ( ( RULE_INT ) )
            // InternalDsl.g:6295:2: ( RULE_INT )
            {
            // InternalDsl.g:6295:2: ( RULE_INT )
            // InternalDsl.g:6296:3: RULE_INT
            {
             before(grammarAccess.getMimicAccess().getMultiplierINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMultiplierINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalDsl.g:6305:1: rule__Mimic__OffSetAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Mimic__OffSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6309:1: ( ( RULE_INT ) )
            // InternalDsl.g:6310:2: ( RULE_INT )
            {
            // InternalDsl.g:6310:2: ( RULE_INT )
            // InternalDsl.g:6311:3: RULE_INT
            {
             before(grammarAccess.getMimicAccess().getOffSetINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getOffSetINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_1_1"
    // InternalDsl.g:6320:1: rule__SafetyController__SoftLowerLimitAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6324:1: ( ( RULE_INT ) )
            // InternalDsl.g:6325:2: ( RULE_INT )
            {
            // InternalDsl.g:6325:2: ( RULE_INT )
            // InternalDsl.g:6326:3: RULE_INT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_1_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_2_1"
    // InternalDsl.g:6335:1: rule__SafetyController__SoftUpperLimitAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6339:1: ( ( RULE_INT ) )
            // InternalDsl.g:6340:2: ( RULE_INT )
            {
            // InternalDsl.g:6340:2: ( RULE_INT )
            // InternalDsl.g:6341:3: RULE_INT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_2_1"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_3_1"
    // InternalDsl.g:6350:1: rule__SafetyController__K_positionAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__SafetyController__K_positionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6354:1: ( ( RULE_INT ) )
            // InternalDsl.g:6355:2: ( RULE_INT )
            {
            // InternalDsl.g:6355:2: ( RULE_INT )
            // InternalDsl.g:6356:3: RULE_INT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_3_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_4_1"
    // InternalDsl.g:6365:1: rule__SafetyController__K_velocityAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__SafetyController__K_velocityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6369:1: ( ( RULE_INT ) )
            // InternalDsl.g:6370:2: ( RULE_INT )
            {
            // InternalDsl.g:6370:2: ( RULE_INT )
            // InternalDsl.g:6371:3: RULE_INT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000801000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000F200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});

}